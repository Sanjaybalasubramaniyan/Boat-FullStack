package com.boat.jagan.controller;



import static com.boat.jagan.util.MyConstant.USER;
import static com.boat.jagan.util.MyConstant.USERLIST;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boat.jagan.dto.response.BasicResponse;
import com.boat.jagan.dto.response.UserResponse;
import com.boat.jagan.service.UserService;

import lombok.RequiredArgsConstructor;
   

@RestController
@RequestMapping(USER)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(USERLIST)
    public ResponseEntity<BasicResponse<UserResponse>> getAllUser(){
        BasicResponse<UserResponse> response=new BasicResponse<>();
        try{
            response=userService.getAllUser();
            return new ResponseEntity<>(response, OK);
        }
        catch(Exception exception){
            response.setMessage("Something Went Wrong");
            return new ResponseEntity<>(response,EXPECTATION_FAILED);
        }
    }
}