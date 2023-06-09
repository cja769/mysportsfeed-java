package com.mysportsfeeds.client.exception;

import lombok.Getter;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MySportsFeedsException extends Exception {

    @Getter
    private HttpResponse<String> response;

    @Getter
    private HttpRequest request;

    public MySportsFeedsException(HttpRequest request, HttpResponse<String> response, String message, IOException e) {
        super(message + "\nRequest: " + request.uri() + "\nResponse: " + response.body(), e);
        this.request = request;
        this.response = response;
    }

    public MySportsFeedsException(HttpRequest request, HttpResponse<String> response, String message) {
        this(request, response, message, null);
    }

    public MySportsFeedsException(HttpRequest request, String message, Exception e) {
        super(message + "\nRequest: " + request.uri(), e);
        this.request = request;
    }

}
