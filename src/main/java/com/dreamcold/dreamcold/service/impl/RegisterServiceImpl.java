package com.dreamcold.dreamcold.service.impl;


import com.dreamcold.dreamcold.entity.User;
import com.dreamcold.dreamcold.mapper.UserMapper;
import com.dreamcold.dreamcold.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean isRegisterSucess(User user) {
        if(user.getPassword()==null||user.getUsername()==null){
            return false;
        }
        if(user.getUsername().length()==0||user.getPassword().length()==0){
            return false;
        }
        //这里其实要进行严格的校验的，但是就这样吧
        userMapper.insert(user);
        return  true;
    }
}
