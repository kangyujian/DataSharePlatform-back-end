package com.dreamcold.dreamcold.mapper;

import com.dreamcold.dreamcold.entity.AssetPricing;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AssetPricingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssetPricing record);

    int insertSelective(AssetPricing record);

    AssetPricing selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssetPricing record);

    int updateByPrimaryKey(AssetPricing record);
}