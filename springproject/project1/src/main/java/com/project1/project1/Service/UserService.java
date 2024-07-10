package com.project1.project1.Service;

import org.springframework.security.core.userdetails.User;


public interface UserService {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    void save(User user);
}