package com.example.securitytest.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginViewController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/loginError")
    public String loginError() {
        return "login";
    }
}
