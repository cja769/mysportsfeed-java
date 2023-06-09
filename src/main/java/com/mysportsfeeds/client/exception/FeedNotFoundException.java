package com.mysportsfeeds.client.exception;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FeedNotFoundException extends MySportsFeedsException {
    public FeedNotFoundException(HttpRequest request, HttpResponse<String> response, String message) {
        super(request, response, message);
    }
}
