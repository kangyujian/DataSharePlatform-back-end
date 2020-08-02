package com.dreamcold.dreamcold.service.impl;


import com.dreamcold.dreamcold.entity.AssetTrading;
import com.dreamcold.dreamcold.mapper.AssetTradingMapper;
import com.dreamcold.dreamcold.service.AssetTradingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class AssetTradingServiceImpl implements AssetTradingService {

    @Autowired
    private AssetTradingMapper assetTradingMapper;

    @Override
    public Boolean insertIntoAssetStatus() {
        return null;
    }

    @Override
    public List<AssetTrading> findAll() {
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
}
