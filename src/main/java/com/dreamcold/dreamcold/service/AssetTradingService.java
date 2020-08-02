package com.dreamcold.dreamcold.service;

import com.dreamcold.dreamcold.entity.AssetTrading;

import java.util.List;

public interface AssetTradingService {
    public Boolean insertIntoAssetStatus();

    public List<AssetTrading> findAll();

    public Boolean updateById();

    public  Boolean deleteById();
}
