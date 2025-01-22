package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.UserResponse;
import com.example.demo.service.EduUserService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/user")
public class EduUserController {

    @Autowired
    private EduUserService userService;

    @GetMapping("/{userNo}")
    public UserResponse getUser(@PathVariable int userNo) {
        return userService.getUser(userNo);
    }
}