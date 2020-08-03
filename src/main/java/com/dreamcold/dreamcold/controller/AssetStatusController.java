package com.dreamcold.dreamcold.controller;


import com.dreamcold.dreamcold.entity.AssetStatus;
import com.dreamcold.dreamcold.service.AssetStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Date;



@Controller
@RequestMapping("/assetStatus")
public class AssetStatusController {


    @Autowired
    private AssetStatusService assetStatusService;

    @RequestMapping(value = "/insert",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Boolean insertIntoAssetStatus(String owner,Date datastarttime,String datatheme,String datasize,String blockversion,Boolean isonline,String datainbloackid) {
        AssetStatus assetStatus = new AssetStatus();
        assetStatus.setBlockversion(blockversion);
        assetStatus.setDatainbloackid(datainbloackid);
        assetStatus.setDatastarttime(datastarttime);
        assetStatus.setOwner(owner);
        assetStatus.setDatatheme(datatheme);
        assetStatus.setDatasize(datasize);
        assetStatus.setIsonline(isonline);
        return assetStatusService.insertIntoAssetStatus(assetStatus);
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<AssetStatus> findAll(){
        return assetStatusService.findAll();
    }


    @RequestMapping(value = "/update",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Boolean updateById(Integer id,String owner,Date datastarttime,String datatheme,String datasize,String blockversion,Boolean isonline,String datainbloackid){
        AssetStatus assetStatus = new AssetStatus();
        assetStatus.setBlockversion(blockversion);
        assetStatus.setDatainbloackid(datainbloackid);
        assetStatus.setDatastarttime(datastarttime);
        assetStatus.setOwner(owner);
        assetStatus.setDatatheme(datatheme);
        assetStatus.setDatasize(datasize);
        assetStatus.setIsonline(isonline);
        assetStatus.setId(id);
        return assetStatusService.updateById(assetStatus);
    }


    @RequestMapping(value = "/delete",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public  Boolean deleteById(Integer id){
        return assetStatusService.deleteById(id);
    }

}
