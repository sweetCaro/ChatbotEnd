package com.example.chatbotend.controller;

import com.example.chatbotend.domin.User;
import com.example.chatbotend.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/users?id=123")//显示所有进出仓货物的信息
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
