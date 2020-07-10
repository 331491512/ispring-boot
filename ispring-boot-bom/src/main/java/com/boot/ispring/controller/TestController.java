package com.boot.ispring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/test")
public class TestController {

//    private final UserServices userServices;

    @GetMapping("/say")
    public String say() {
//        UserInfo userInfo = userServices.getById("1");
//        System.err.println(userInfo);
        return "Hello World !";
    }
}
