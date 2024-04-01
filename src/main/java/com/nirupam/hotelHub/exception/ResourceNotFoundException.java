package com.nirupam.hotelHub.exception;

/**
 * @author Nirupam Sur
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
