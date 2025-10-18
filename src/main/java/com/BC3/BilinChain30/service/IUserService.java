package com.BC3.BilinChain30.service;

import com.BC3.BilinChain30.dto.request.UserRequest;
import com.BC3.BilinChain30.dto.response.UserResponse;

public interface IUserService {

    UserResponse createUser(UserRequest userRequest);

    UserResponse findUserByID(long userId);
}
