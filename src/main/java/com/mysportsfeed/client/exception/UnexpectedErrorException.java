package com.mysportsfeed.client.exception;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UnexpectedErrorException extends MySportsFeedException {
    public UnexpectedErrorException(HttpRequest request, HttpResponse<?> response, String message) {
        super(request, response, message);
    }
}
