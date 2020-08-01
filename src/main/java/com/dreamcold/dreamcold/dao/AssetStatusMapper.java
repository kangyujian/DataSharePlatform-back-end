package com.dreamcold.dreamcold.dao;

import com.dreamcold.dreamcold.entity.AssetStatus;

public interface AssetStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssetStatus record);

    int insertSelective(AssetStatus record);

    AssetStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssetStatus record);

    int updateByPrimaryKey(AssetStatus record);
}