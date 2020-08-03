package com.dreamcold.dreamcold.service;

import com.dreamcold.dreamcold.entity.AssetStatus;
import com.dreamcold.dreamcold.entity.AssetTrading;

import java.util.List;

public interface AssetTradingService {
    public Boolean insert(AssetTrading assetTrading);

    public List<AssetTrading> findAll();

    public Boolean updateById(AssetTrading assetTrading);

    public  Boolean deleteById(Integer id);
}
