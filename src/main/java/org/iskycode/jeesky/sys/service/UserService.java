package org.iskycode.jeesky.sys.service;

import org.iskycode.jeesky.sys.entity.Permission;
import org.iskycode.jeesky.sys.entity.Role;
import org.iskycode.jeesky.sys.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    public User findUserByName(String name) {
        User user = new User();
        return user;
    }

    public Set<Role> findRolesByName(String name) {
        Set<Role> set = new HashSet<Role>();
        return set;
    }

    public Set<Permission> findPermissionsByName(String name) {
        Set<Permission> set = new HashSet<Permission>();
        return set;
    }
}
