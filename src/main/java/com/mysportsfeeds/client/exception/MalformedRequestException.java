package com.mysportsfeeds.client.exception;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MalformedRequestException extends MySportsFeedsException {
    public MalformedRequestException(HttpRequest request, HttpResponse<?> response, String message) {
        super(request, response, message);
    }
}
