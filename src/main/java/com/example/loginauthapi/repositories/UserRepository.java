package com.example.loginauthapi.repositories;

import com.example.loginauthapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, String> {
}
