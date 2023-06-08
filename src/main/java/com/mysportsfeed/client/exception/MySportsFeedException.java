package com.mysportsfeed.client.exception;

import lombok.Getter;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MySportsFeedException extends Exception {

    @Getter
    private HttpResponse<?> response;

    @Getter
    private HttpRequest request;

    public MySportsFeedException(HttpRequest request, HttpResponse<?> response, String message, IOException e) {
        super(message, e);
        this.request = request;
        this.response = response;
    }

    public MySportsFeedException(HttpRequest request, HttpResponse<?> response, String message) {
        this(request, response, message, null);
    }

    public MySportsFeedException(HttpRequest request, String message, Exception e) {
        super(message, e);
        this.request = request;
    }

}
