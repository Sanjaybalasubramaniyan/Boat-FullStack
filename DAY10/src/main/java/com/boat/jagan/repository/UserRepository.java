package com.boat.jagan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boat.jagan.model.User;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmail(String email);
    
}
