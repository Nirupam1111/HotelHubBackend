package com.nirupam.hotelHub.exception;

/**
 * @author Nirupam Sur
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
