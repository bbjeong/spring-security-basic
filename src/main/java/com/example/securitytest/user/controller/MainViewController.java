package com.example.securitytest.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainViewController {

    @PostMapping("/main")
    public String login() {
        return "main";
    }
}
