package com.boat.jagan.service.impl;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.boat.jagan.dto.response.BasicResponse;
import com.boat.jagan.dto.response.UserResponse;
import com.boat.jagan.model.User;
import com.boat.jagan.repository.UserRepository;
import com.boat.jagan.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public BasicResponse<UserResponse> getAllUser(){
        List<User> users=userRepository.findAll();
        List<UserResponse> userResponses=users.stream().map(user -> UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .role(user.getRole())
                .address(user.getAddress())
                .phoneNumber(user.getPhoneNumber())
                .build()).collect(Collectors.toList());
        return BasicResponse.<UserResponse>builder().message("User Data Fetched Sucessfully!").data(userResponses).build();
    }
}