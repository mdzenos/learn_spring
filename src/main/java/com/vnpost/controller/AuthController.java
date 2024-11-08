package com.vnpost.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class AuthController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome!";
    }
}
