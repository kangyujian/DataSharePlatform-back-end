package com.dreamcold.dreamcold.service.impl;


import com.dreamcold.dreamcold.entity.AssetTrading;
import com.dreamcold.dreamcold.mapper.AssetTradingMapper;
import com.dreamcold.dreamcold.service.AssetTradingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AssetTradingServiceImpl implements AssetTradingService {

    @Autowired
    private AssetTradingMapper assetTradingMapper;

    @Override
    public Boolean insert(AssetTrading assetTrading) {
        if(!isNULL(assetTrading)){
            return false;
        }
        if(assetTradingMapper.insert(assetTrading)!=0){
            return true;
        }else{
            return  false;
        }
    }

    private Boolean isNULL(AssetTrading assetTrading){
        if(assetTrading.getIsonline()==null||assetTrading.getDatasize()==null||assetTrading.getDatatheme()==null||
        assetTrading.getDatavalue()==null||assetTrading.getUsers()==null||assetTrading.getOwner()==null){
            return false;
        }
        if(assetTrading.getDatasize().length()==0||assetTrading.getDatatheme().length()==0||
                assetTrading.getDatavalue().length()==0||assetTrading.getUsers().length()==0||assetTrading.getOwner().length()==0){
            return false;
        }
        return true;
    }

    @Override
    public List<AssetTrading> findAll() {
        return assetTradingMapper.findAll();
    }

    @Override
    public Boolean updateById(AssetTrading assetTrading) {
        if(!isNULL(assetTrading)){
            return false;
        }
        if(assetTradingMapper.updateByPrimaryKey(assetTrading)!=0){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public Boolean deleteById(Integer id) {
        if(assetTradingMapper.deleteByPrimaryKey(id)!=0){
            return true;
        }else{
            return false;
        }
    }
}
