package com.dipankar.rest_example.exceptions;

public class NoDataFoundException  extends RuntimeException{

    public NoDataFoundException(String message) {
        super(message);
    }
}
