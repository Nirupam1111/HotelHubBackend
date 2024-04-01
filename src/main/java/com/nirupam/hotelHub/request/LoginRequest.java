package com.nirupam.hotelHub.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Nirupam Sur
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
