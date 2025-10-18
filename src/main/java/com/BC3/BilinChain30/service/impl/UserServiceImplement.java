package com.BC3.BilinChain30.service.impl;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BC3.BilinChain30.dto.request.UserRequest;
import com.BC3.BilinChain30.dto.response.UserResponse;
import com.BC3.BilinChain30.enitys.UserEntity;
import com.BC3.BilinChain30.enitys.enums.UserStatus;
import com.BC3.BilinChain30.repository.UserRepository;
import com.BC3.BilinChain30.service.IUserService;

@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {

        UserEntity userEntity = UserEntity.builder()
                .email(userRequest.email())
                .username(userRequest.username())
                .firstName(userRequest.first_name())
                .lastName(userRequest.last_name())
                .passwordHash(userRequest.password_hash())
                .status(UserStatus.ACTIVE)
                .build();

        var userRecorded = userRepository.save(userEntity);

        return UserResponse.builder()
                .id(Long.toString(userRecorded.getId()))
                .first_name(userRecorded.getFirstName())
                .build();

    }

    @Override
    public UserResponse findUserByID(long userId) {

        System.out.println("alooo " + userId);
        UserEntity userRecorded = userRepository.findById(userId).orElse(null);

        System.out.println("alooo " + userRecorded);

        return UserResponse.builder()
                .id(Long.toString(userRecorded.getId()))
                .first_name(userRecorded.getFirstName())
                .build();

    }

}
