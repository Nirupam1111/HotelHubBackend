package com.nirupam.hotelHub.service;

import com.nirupam.hotelHub.model.Role;
import com.nirupam.hotelHub.model.User;

import java.util.List;

/**
 * @author Nirupam Sur
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
