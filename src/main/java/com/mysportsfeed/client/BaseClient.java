package com.mysportsfeed.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysportsfeed.client.exception.*;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Base64;
import java.util.List;

public abstract class BaseClient {

    @Getter
    private final String apiKey;
    @Getter
    private final String password;
    @Setter
    private boolean compress = true;

    public BaseClient(String apiKey, String password) {
        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalArgumentException("API Key cannot be blank or null");
        }
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be blank or null");
        }
        this.apiKey = apiKey;
        this.password = password;
    }

    protected  <T> T execute(String url, Class<T> responseType) throws MySportsFeedException {
        String authorization = Base64.getEncoder().encodeToString((getApiKey() + ":" + getPassword()).getBytes());
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(url))
            .GET()
            .header("Authorization", "Basic " + authorization)
            .header("Accept-Encoding", "gzip")
            .build();
        if (!compress) {
            request = HttpRequest.newBuilder(URI.create(url))
                .GET()
                .header("Authorization", "Basic " + authorization)
                .build();
        }
        HttpResponse<String> response;
        try {
            response = httpClient.send(request, BodyHandlers.ofString());
        } catch (InterruptedException | IOException e) {
            throw new MySportsFeedException(request, "Error occurred retrieving data", e);
        }
        if (response.statusCode() == 204) {
            throw new FeedContentNotFoundException(request, response, "Feed content is not available");
        }
        if (response.statusCode() == 400) {
            throw new MalformedRequestException(request, response, "Request was malformed");
        }
        if (response.statusCode() == 401) {
            throw new UnauthenticatedException(request, response, "Request didn't have authentication");
        }
        if (response.statusCode() == 403) {
            throw new ForbiddenException(request, response, "Authentication used for request did not have authorization. Subscribe to feed for acccess");
        }
        if (response.statusCode() == 429) {
            throw new TooManyRequestsException(request, response, "Rate limit has been hit");
        }
        if (response.statusCode() == 500) {
            throw new InternalFeedException(request, response, "An error has occurred on the requested server");
        }
        if (List.of(499, 502, 503).contains(response.statusCode())) {
            throw new PeriodicErrorException(request, response, "A known periodic error has occurred. This usually means the system is publishing a stream and the error should not continue.\nIf the error persists reach out to MySportsFeed at https://www.mysportsfeeds.com/contact-us");
        }
        if (!List.of(200, 304).contains(response.statusCode())) {
            throw new UnexpectedErrorException(request, response, "A status code of " + response.statusCode() + " was returned and is not one of the expected status codes.\nReach out to https://www.mysportsfeeds.com/contact-us to report this error");
        }
        try {
            return new ObjectMapper().readValue(response.body(), responseType);
        } catch (IOException e) {
            throw new MySportsFeedException(request, response, "Unable to parse response", e);
        }
    }
}
