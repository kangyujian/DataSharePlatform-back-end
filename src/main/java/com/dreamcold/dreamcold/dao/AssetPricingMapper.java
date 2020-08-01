package com.dreamcold.dreamcold.dao;

import com.dreamcold.dreamcold.entity.AssetPricing;

public interface AssetPricingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssetPricing record);

    int insertSelective(AssetPricing record);

    AssetPricing selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssetPricing record);

    int updateByPrimaryKey(AssetPricing record);
}