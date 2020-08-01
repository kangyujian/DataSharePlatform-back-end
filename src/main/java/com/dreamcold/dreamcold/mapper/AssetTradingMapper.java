package com.dreamcold.dreamcold.mapper;

import com.dreamcold.dreamcold.entity.AssetTrading;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AssetTradingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssetTrading record);

    int insertSelective(AssetTrading record);

    AssetTrading selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssetTrading record);

    int updateByPrimaryKey(AssetTrading record);
}