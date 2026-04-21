package com.deployment.praktikum8.services;

import com.deployment.praktikum8.models.User;
import org.springframework.stereotype.Service;

import com.deployment.praktikum8.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
