package com.dreamcold.dreamcold.service.impl;

import com.dreamcold.dreamcold.entity.User;
import com.dreamcold.dreamcold.mapper.UserMapper;
import com.dreamcold.dreamcold.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public Boolean insertIntoAssetStatus() {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Boolean updateById() {
        return null;
    }

    @Override
    public Boolean deleteById() {
        return null;
    }

    @Override
    public Boolean isLoginSucess(String userName,String passWord) {
        return null;
    }
}

