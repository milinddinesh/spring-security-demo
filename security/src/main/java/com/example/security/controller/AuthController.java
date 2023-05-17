package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.security.services.UserService;
import com.example.security.models.User;
import com.example.security.repositories.UserRepo;

@Controller
public class AuthController {
    private final UserService userService;

    @Autowired
    public AuthController(UserService userService){
        this.userService = userService;
    }

    @Autowired
    private UserRepo userRepo;

    @PostMapping(path = "/auth/login")
    public String login(@ModelAttribute User user){
        if (userService.login(user.getUsername(), user.getPassword())){
            return "index";
        }
        else {
            return "register";
        }
    }

    @PostMapping(path="/auth/test")
    public @ResponseBody String testPost(){
        return "it worked";
    }

    @PostMapping(path = "/auth/register")
    public String register(@ModelAttribute User user){
        userRepo.save(user);
        return "index";
    }
}
