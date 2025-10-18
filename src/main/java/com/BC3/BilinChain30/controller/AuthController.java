package com.BC3.BilinChain30.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BC3.BilinChain30.dto.ApiResponse;
import com.BC3.BilinChain30.dto.request.UserRequest;
import com.BC3.BilinChain30.dto.response.UserResponse;
import com.BC3.BilinChain30.service.IUserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private IUserService userService;

    // @PostMapping
    // public ApiResponse<UserResponse> createUser(@RequestBody UserRequest
    // userRequest) {

    // return ApiResponse.<UserResponse>builder()
    // .message("Passs")
    // .result(userService.createUser(userRequest))
    // .build();
    // }
    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest) {

        return userService.createUser(userRequest);
    }

    @GetMapping("/{userId}")
    public UserResponse getUser(@PathVariable long userId) {
        return userService.findUserByID(userId);
    }

}
