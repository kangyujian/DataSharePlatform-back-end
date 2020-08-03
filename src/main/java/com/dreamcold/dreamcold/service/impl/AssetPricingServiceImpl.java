package com.dreamcold.dreamcold.service.impl;

import com.dreamcold.dreamcold.entity.AssetPricing;
import com.dreamcold.dreamcold.mapper.AssetPricingMapper;
import com.dreamcold.dreamcold.service.AssetPricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public  class AssetPricingServiceImpl implements AssetPricingService {


    @Autowired
    private AssetPricingMapper assetPricingMapper;

    public Boolean insertIntoAssetPricing(AssetPricing assetPricing){
        if(!isNULL(assetPricing)){
            return false;
        }
        assetPricingMapper.insert(assetPricing);
        return true;
    }

    private  Boolean isNULL(AssetPricing assetPricing){
        if(assetPricing.getIsonline()==null||assetPricing.getDatacheacker()==null||assetPricing.getDatapricedecidetime()==null
                ||assetPricing.getDatasize()==null||assetPricing.getDatavalue()==null){
            return false;
        }
        if(assetPricing.getDatacheacker().length()==0||assetPricing.getDatasize().length()==0||assetPricing.getDatasize().length()==0||
                assetPricing.getDatasize().length()==0){
            return false;
        }
        return  true;
    }

    public List<AssetPricing> findAll(){
        return assetPricingMapper.findAll();
    }

    public Boolean updateById(AssetPricing assetPricing){
        if(!isNULL(assetPricing)){
            return false;
        }
        assetPricingMapper.updateByPrimaryKey(assetPricing);
        return  true;
    }

    public  Boolean deleteById(Integer id){
        if (assetPricingMapper.deleteByPrimaryKey(id)!=0){
            return true;
        }else{
            return false;
        }
    }



}
