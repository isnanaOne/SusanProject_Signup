package com.susan.domain.dao;

import com.susan.domain.request.SignupRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int signup(SignupRequest signupRequest);
}
