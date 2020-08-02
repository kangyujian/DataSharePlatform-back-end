package com.dreamcold.dreamcold.service;

import com.dreamcold.dreamcold.entity.AssetStatus;

import java.util.List;

public interface AssetStatusService {


    public Boolean insertIntoAssetStatus();

    public List<AssetStatus> findAll();

    public Boolean updateById();

    public  Boolean deleteById();
}
