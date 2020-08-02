package com.dreamcold.dreamcold.service;

import com.dreamcold.dreamcold.entity.AssetPricing;

import java.util.List;

public interface AssetPricingService {


    public Boolean insertIntoAssetPricing();

    public List<AssetPricing> findAll();

    public Boolean updateById();

    public  Boolean deleteById();

}
