package com.dreamcold.dreamcold.service;

import com.dreamcold.dreamcold.entity.User;

import java.util.List;

public interface LoginService {

    public Boolean insertIntoAssetStatus();

    public List<User> findAll();

    public Boolean updateById();

    public  Boolean deleteById();


    public Boolean isLoginSucess(String userName,String passWord);
}
