package com.boat.sanjay45.Service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.boat.sanjay45.Service.UserService;
import com.boat.sanjay45.UserRepository.UserRepository;
import com.boat.sanjay45.dto.response.BasicResponse;
import com.boat.sanjay45.dto.response.UserResponse;
import com.boat.sanjay45.model.User;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
    
    private final UserRepository userRepository;
    
    
    @Override
    public BasicResponse<UserResponse> getAllUser() {
        List<User> users= userRepository.findAll();
        List<UserResponse> userResponses= users.stream().map(user -> UserResponse.builder()
        .id(user.getId())
        .name(user.getName())
        .email(user.getEmail())
        .password(user.getPassword())
        .role(user.getRole())
        .build())
        .collect(Collectors.toList());
        return BasicResponse.<UserResponse>builder()
        .message("User Data fetched").data(userResponses).build();
    }

}