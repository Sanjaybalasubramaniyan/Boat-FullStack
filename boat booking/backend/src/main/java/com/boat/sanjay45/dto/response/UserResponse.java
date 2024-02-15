package com.boat.sanjay45.dto.response;



import com.boat.sanjay45.enumerated.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private String id;

    private String name;

    private String email;

    private String password;

    private Role role;

    private String image;

    private Long phoneNumber;

    
}