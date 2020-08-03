package com.dreamcold.dreamcold.service;

import com.dreamcold.dreamcold.entity.AssetStatus;

import java.util.List;

public interface AssetStatusService {

    public Boolean insertIntoAssetStatus(AssetStatus assetStatus);

    public List<AssetStatus> findAll();

    public Boolean updateById(AssetStatus assetStatus);

    public  Boolean deleteById(Integer id);
}
