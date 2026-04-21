package com.deployment.praktikum8.repository;

import com.deployment.praktikum8.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}


