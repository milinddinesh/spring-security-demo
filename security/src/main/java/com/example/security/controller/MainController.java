package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.repositories.UserRepo;;

@Controller
public class MainController {

    @GetMapping(path = "/auth/login/form")
    public String loginForm(){
        return "login";
    }

    @GetMapping(path = "/auth/register/form")
    public String registerForm(){
        return "register";
    }

    @PostMapping(path = "/test")
    public @ResponseBody String test(){
        return "working";
    }
}
