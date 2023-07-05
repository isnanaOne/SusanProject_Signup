package com.susan.controller;

import com.susan.domain.request.SignupRequest;
import com.susan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class SignupController {
    // id, pw
    // 이름
    // 타입(사장인지, 일반유저인지) 관리자 계정은 따로 만들거임
    // e-mail
    // phone
    // address
    private final UserService userService;

    public SignupController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public String getSignup() {return "/user/signup";}


    @PostMapping("/signup")
    public ModelAndView signup(
            @ModelAttribute SignupRequest request
            , ModelAndView mav
    ){
        if(userService.signup(request)){
            mav.setViewName("redirect:/user/login");
        }else {
            mav.setViewName("redirect:/user/signup");
        }
        return mav;
    }
}