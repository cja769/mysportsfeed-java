package com.mysportsfeeds.client.exception;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UnauthenticatedException extends MySportsFeedsException {
    public UnauthenticatedException(HttpRequest request, HttpResponse<String> response, String message) {
        super(request, response, message);
    }
}
