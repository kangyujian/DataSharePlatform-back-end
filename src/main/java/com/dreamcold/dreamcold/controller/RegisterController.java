package com.dreamcold.dreamcold.controller;

import com.dreamcold.dreamcold.entity.User;
import com.dreamcold.dreamcold.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping(value = "/register")
@Controller
public class RegisterController {


    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/isRegisterSucess",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Boolean isRegisterSucess(String userName,String passWord){
        User user=new User();
        user.setUsername(userName);
        user.setPassword(passWord);
        return  registerService.isRegisterSucess(user);
    }

}
