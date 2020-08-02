package com.dreamcold.dreamcold.controller;




import com.dreamcold.dreamcold.entity.User;
import com.dreamcold.dreamcold.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
@RequestMapping("/logins")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @ResponseBody
    @RequestMapping("/users")
    public User getUser(){
        return  userMapper.selectByPrimaryKey(1);
    }












}
