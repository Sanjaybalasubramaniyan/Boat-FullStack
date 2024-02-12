package com.boat.jagan.service.impl;

import static enumurated.Role.*;

import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.boat.jagan.dto.request.Loginrequest;
import com.boat.jagan.dto.request.RegisterRequest;
import com.boat.jagan.dto.response.LoginResponse;
import com.boat.jagan.dto.response.RegisterResponse;
import com.boat.jagan.model.User;
import com.boat.jagan.repository.UserRepository;
import com.boat.jagan.service.AuthenticationService;
import com.boat.jagan.util.JwtUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceimpl implements AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @Override
    public RegisterResponse register(RegisterRequest request) {
        Optional<User> isUserExist = userRepository.findByEmail(request.getEmail());
        if(isUserExist.isPresent()){
            return RegisterResponse.builder().message("User with mail id "+ request.getEmail()+" is already exist").build();
        }
        var user = User.builder()
        .name(request.getName())
        .email(request.getEmail())
        .password(passwordEncoder.encode(request.getPassword()))
        .role(USER)
        .build();
        userRepository.save(user);
        return RegisterResponse.builder()
        .message("user created successfully")
        .build();
    }
    
    @Override
    public LoginResponse login(Loginrequest request) {
        authenticationManager
            .authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
            var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
            String token = jwtUtil.generateToken(user);
            return LoginResponse.builder()
            .message("User logged in sucessfully")
            .token(token)
            .build();
    }

}
