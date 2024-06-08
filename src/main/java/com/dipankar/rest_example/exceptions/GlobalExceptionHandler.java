package com.dipankar.rest_example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoDataFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public String noDataFoundHandler(NoDataFoundException ex, WebRequest request) {
        return ex.getMessage();
    }
}
