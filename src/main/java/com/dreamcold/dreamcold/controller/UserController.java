package com.dreamcold.dreamcold.controller;


import com.dreamcold.dreamcold.entity.User;
import com.dreamcold.dreamcold.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserMapper usermapper;

    @RequestMapping("/user")
    public List<User> getAllUser(){
        List<User> users=usermapper.findAll();
        return users;
    }
}
