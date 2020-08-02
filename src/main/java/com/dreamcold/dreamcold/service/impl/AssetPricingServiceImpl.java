package com.dreamcold.dreamcold.service.impl;

import com.dreamcold.dreamcold.entity.AssetPricing;
import com.dreamcold.dreamcold.mapper.AssetPricingMapper;
import com.dreamcold.dreamcold.service.AssetPricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AssetPricingServiceImpl implements AssetPricingService {

    @Autowired
    private AssetPricingMapper assetPricingMapper;

    public Boolean insertIntoAssetPricing(){
        return  false;
    }

    public List<AssetPricing> findAll(){
        return null;
    }

    public Boolean updateById(){
        return false;
    }

    public  Boolean deleteById(){
        return false;
    }



}
