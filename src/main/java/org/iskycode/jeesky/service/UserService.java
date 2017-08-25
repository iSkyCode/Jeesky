package org.iskycode.jeesky.service;

import org.iskycode.jeesky.entity.Permission;
import org.iskycode.jeesky.entity.Role;
import org.iskycode.jeesky.entity.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
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
