package com.boat.sanjay45.Service;

import com.boat.sanjay45.dto.response.BasicResponse;
import com.boat.sanjay45.dto.response.UserResponse;

public interface UserService {
   BasicResponse<UserResponse>getAllUser();
}
