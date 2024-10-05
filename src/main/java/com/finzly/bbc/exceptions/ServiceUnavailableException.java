package com.finzly.bbc.exceptions;

public class ServiceUnavailableException extends RuntimeException {
    public ServiceUnavailableException (String message) {
        super (message);
    }

    public ServiceUnavailableException (String message, Throwable cause) {
        super (message, cause);
    }
}