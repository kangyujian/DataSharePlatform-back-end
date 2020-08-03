package com.dreamcold.dreamcold.mapper;

import com.dreamcold.dreamcold.entity.AssetStatus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AssetStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssetStatus record);

    int insertSelective(AssetStatus record);

    AssetStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssetStatus record);

    int updateByPrimaryKey(AssetStatus record);

    List<AssetStatus> findAll();
}