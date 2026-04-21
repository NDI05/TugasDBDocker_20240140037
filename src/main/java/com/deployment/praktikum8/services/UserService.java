package com.deployment.praktikum8.services;

import com.deployment.praktikum8.models.User;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.deployment.praktikum8.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User request) {
        request.setId(UUID.randomUUID().toString());
        return userRepository.save(request);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    
}
