package com.nirupam.hotelHub.service;

import com.nirupam.hotelHub.model.User;

import java.util.List;

/**
 * @author Nirupam Sur
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
