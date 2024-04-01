package com.nirupam.hotelHub.exception;

/**
 * @author Nirupam Sur
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
