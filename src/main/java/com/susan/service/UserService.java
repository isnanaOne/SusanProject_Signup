package com.susan.service;

import com.susan.domain.dao.UserMapper;
import com.susan.domain.request.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper userMapper;

    public boolean signup(SignupRequest signupRequest) {
        return userMapper.signup(signupRequest) != 0;
    }

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
