package com.nirupam.hotelHub.exception;

/**
 * @author Nirupam Sur
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
