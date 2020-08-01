package com.dreamcold.dreamcold.dao;

import com.dreamcold.dreamcold.entity.AssetTrading;

public interface AssetTradingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssetTrading record);

    int insertSelective(AssetTrading record);

    AssetTrading selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssetTrading record);

    int updateByPrimaryKey(AssetTrading record);
}