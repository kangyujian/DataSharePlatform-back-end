package com.dreamcold.dreamcold.controller;


import com.dreamcold.dreamcold.entity.AssetTrading;
import com.dreamcold.dreamcold.service.AssetTradingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;



@Controller
@RequestMapping(value = "/assetTrading")
public class AssetTradingController {

    @Autowired
    private AssetTradingService assetTradingService;



    @RequestMapping(value = "/insert",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Boolean insert(String owner,String users,String tradetime,String datatheme,String datavalue,String datasize,Boolean isonline){
        AssetTrading assetTrading=new AssetTrading();
        assetTrading.setDatasize(datasize);
        assetTrading.setDatatheme(datatheme);
        assetTrading.setDatavalue(datavalue);
        assetTrading.setIsonline(isonline);
        assetTrading.setOwner(owner);
        assetTrading.setUsers(users);
        assetTrading.setTradetime(tradetime);
        return  assetTradingService.insert(assetTrading);
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<AssetTrading> findAll(){
        return assetTradingService.findAll();
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Boolean updateById(Integer id,String owner,String users,String tradetime,String datatheme,String datavalue,String datasize,Boolean isonline){
        AssetTrading assetTrading=new AssetTrading();
        assetTrading.setDatasize(datasize);
        assetTrading.setDatatheme(datatheme);
        assetTrading.setDatavalue(datavalue);
        assetTrading.setIsonline(isonline);
        assetTrading.setOwner(owner);
        assetTrading.setUsers(users);
        assetTrading.setTradetime(tradetime);
        assetTrading.setId(id);
        return assetTradingService.updateById(assetTrading);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public  Boolean deleteById(Integer id){
        return assetTradingService.deleteById(id);
    }

}
