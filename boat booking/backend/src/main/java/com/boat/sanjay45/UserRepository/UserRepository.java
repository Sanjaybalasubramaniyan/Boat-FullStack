package com.boat.sanjay45.UserRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boat.sanjay45.model.User;

public interface UserRepository extends JpaRepository<User,String> {
    Optional<User>findByEmail(String email);
   
}
