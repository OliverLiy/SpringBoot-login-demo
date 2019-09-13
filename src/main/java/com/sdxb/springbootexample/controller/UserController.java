package com.sdxb.springbootexample.controller;

import com.sdxb.springbootexample.entity.User;
import com.sdxb.springbootexample.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {
    // 注入UserService
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(User user) {
        ModelAndView mv = new ModelAndView();
        user = userService.get(user);

        if (user != null) {
            mv.addObject("user", user);
            return "user";
        } else {
            return "login";
        }
    }
}
