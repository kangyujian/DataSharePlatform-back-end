package com.dreamcold.dreamcold.service.impl;

import com.dreamcold.dreamcold.entity.AssetStatus;
import com.dreamcold.dreamcold.mapper.AssetStatusMapper;
import com.dreamcold.dreamcold.service.AssetStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AssetStatusServiceImpl implements AssetStatusService {

    @Autowired
    private AssetStatusMapper assetStatusMapper;


    @Override
    public Boolean insertIntoAssetStatus() {
        return null;
    }

    @Override
    public List<AssetStatus> findAll() {
        return null;
    }

    @Override
    public Boolean updateById() {
        return null;
    }

    @Override
    public Boolean deleteById() {
        return null;
    }
}


