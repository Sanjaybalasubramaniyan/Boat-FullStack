package com.boat.sanjay45.Service;

import com.boat.sanjay45.dto.request.RegisterRequest;
import com.boat.sanjay45.dto.request.loginRequest;
import com.boat.sanjay45.dto.response.LoginResponse;
import com.boat.sanjay45.dto.response.RegisterResponse;

public interface AuthenticationService {
        RegisterResponse register (RegisterRequest request);

        LoginResponse login(loginRequest request);
}
