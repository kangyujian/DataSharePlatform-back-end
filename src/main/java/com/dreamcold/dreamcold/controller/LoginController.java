package com.dreamcold.dreamcold.controller;


import com.dreamcold.dreamcold.entity.User;
import com.dreamcold.dreamcold.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/isloginSucess",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Boolean isLoginSucess(String userName,String passWord){
        User tmp=new User();
        tmp.setUsername(userName);
        tmp.setPassword(passWord);
        return  loginService.isLoginSucess(tmp);
    }
}
