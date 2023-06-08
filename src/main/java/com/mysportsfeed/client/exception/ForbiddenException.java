package com.mysportsfeed.client.exception;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ForbiddenException extends MySportsFeedException {
    public ForbiddenException(HttpRequest request, HttpResponse<?> response, String message) {
        super(request, response, message);
    }
}
