package com.blogapp.blog.services;

import com.blogapp.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
