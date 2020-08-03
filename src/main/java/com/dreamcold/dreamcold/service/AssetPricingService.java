package com.dreamcold.dreamcold.service;

import com.dreamcold.dreamcold.entity.AssetPricing;

import java.util.List;

public interface AssetPricingService {

    public Boolean insertIntoAssetPricing(AssetPricing assetPricing);
    List<AssetPricing> findAll();
    public Boolean updateById(AssetPricing assetPricing);
    public  Boolean deleteById(Integer id);

}
