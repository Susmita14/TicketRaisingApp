package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

    @GetMapping("/")
    public String home() {
        return "home"; // home.html
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // login.html
    }
}
