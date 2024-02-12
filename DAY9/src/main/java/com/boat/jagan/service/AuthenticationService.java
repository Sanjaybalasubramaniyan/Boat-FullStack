package com.boat.jagan.service;

import com.boat.jagan.dto.request.Loginrequest;
import com.boat.jagan.dto.request.RegisterRequest;
import com.boat.jagan.dto.response.LoginResponse;
import com.boat.jagan.dto.response.RegisterResponse;

public interface AuthenticationService {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(Loginrequest request);

}
