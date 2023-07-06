package com.susan.service;

import com.susan.domain.dao.UserMapper;
import com.susan.domain.request.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper userMapper;

//    public UserService(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    public boolean signup(SignupRequest signupRequest) {
//        if (isUsernameExists(signupRequest.getName()) {
//            return false; // 이미 아이디가 존재하면 회원가입 실패
//        }
        return userMapper.signup(signupRequest) != 0;
    }

    public boolean isUsernameExists(SignupRequest signupRequest) {
        return userMapper.signup(signupRequest) > 0;
    }

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public boolean signupAsAdmin(SignupRequest signupRequest) {
        try {
            userMapper.signupAsAdmin(signupRequest);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        // 성공시  true, 실패시 false
    }

    public boolean signupAsUser(SignupRequest signupRequest) {
        try {
            // 일반 유저 모드 회원가입 로직 구현
            userMapper.signupAsUser(signupRequest);
            return true; // 성공 시 true 반환
        } catch (Exception e) {
            e.printStackTrace();
            return false; // 실패 시 false 반환
        }
    }
}


