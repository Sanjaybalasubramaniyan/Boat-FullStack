package com.boat.jagan.service;

import com.boat.jagan.dto.response.BasicResponse;
import com.boat.jagan.dto.response.UserResponse;

public interface UserService {

    BasicResponse<UserResponse> getAllUser();

}