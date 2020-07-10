package com.boot.ispring.user.controller;

import com.boot.ispring.user.service.UserServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServices userServices;

    @GetMapping("/say")
    public String say() {
        return "这是User的controller";
    }
}
