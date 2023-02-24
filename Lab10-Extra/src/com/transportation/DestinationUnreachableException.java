package com.transportation;

public class DestinationUnreachableException extends Exception {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public DestinationUnreachableException() {
        super();
    }

    public DestinationUnreachableException(String message) {
        super(message);
    }

    public DestinationUnreachableException(Throwable cause) {
        super(cause);
    }

    public DestinationUnreachableException(String message, Throwable cause) {
        super(message, cause);
    }
}