package com.sake.service;

import com.sake.entity.Role;

public interface RoleService {

    Role findRoleByName(String name);
    Role findRoleById(Integer id);
    Role addRole(Role role);
    void deleteRole(Integer id);
}
