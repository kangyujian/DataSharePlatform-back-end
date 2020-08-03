package com.dreamcold.dreamcold.service.impl;

import com.dreamcold.dreamcold.entity.AssetStatus;
import com.dreamcold.dreamcold.mapper.AssetStatusMapper;
import com.dreamcold.dreamcold.service.AssetStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//private Integer id;
//
//private String owner;
//
//private Date datastarttime;
//
//private String datatheme;
//
//private String datasize;
//
//private String blockversion;
//
//private String datainbloackid;
//
//private Boolean isonline;


@Service
public class AssetStatusServiceImpl implements AssetStatusService {

    @Autowired
    private AssetStatusMapper assetStatusMapper;


    @Override
    public Boolean insertIntoAssetStatus(AssetStatus assetStatus) {
        if(!isNULL(assetStatus)){
            return false;
        }
        if(assetStatusMapper.insert(assetStatus)!=0){
            return true;
        }else{
            return false;
        }
    }

    private Boolean isNULL(AssetStatus assetStatus){
        if(assetStatus.getId()==null||assetStatus.getIsonline()==null||assetStatus.getBlockversion()==null||
        assetStatus.getOwner()==null||assetStatus.getDatainbloackid()==null||assetStatus.getDatatheme()==null||
        assetStatus.getDatasize()==null
        ) {
            return false;
        }
        if(assetStatus.getBlockversion().length()==0||
                assetStatus.getOwner().length()==0||assetStatus.getDatainbloackid().length()==0||assetStatus.getDatatheme().length()==0||
                assetStatus.getDatasize().length()==0){
            return false;
        }
        return true;
    }

    @Override
    public List<AssetStatus> findAll() {
        return assetStatusMapper.findAll();
    }

    @Override
    public Boolean updateById(AssetStatus assetStatus) {
        if(!isNULL(assetStatus)){
            return false;
        }
        if (assetStatusMapper.updateByPrimaryKey(assetStatus) != 0) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Boolean deleteById(Integer id) {
        if(assetStatusMapper.deleteByPrimaryKey(id)!=0){
            return true;
        }else{
            return false;
        }
    }
}


