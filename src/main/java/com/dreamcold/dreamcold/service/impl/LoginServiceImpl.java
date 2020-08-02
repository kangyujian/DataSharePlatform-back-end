package com.dreamcold.dreamcold.service.impl;

import com.dreamcold.dreamcold.entity.User;
import com.dreamcold.dreamcold.mapper.UserMapper;
import com.dreamcold.dreamcold.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean isLoginSucess(User user) {
        User res=userMapper.selectByUserName(user);
        if(res!=null){
            if(res.getPassword().equals(user.getPassword())){
                return  true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

}

