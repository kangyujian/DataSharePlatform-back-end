package com.dreamcold.dreamcold.controller;


import com.dreamcold.dreamcold.entity.AssetTrading;
import com.dreamcold.dreamcold.service.AssetTradingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



@Controller
@RequestMapping(value = "/assetTrading")
public class AssetTradingController {

    @Autowired
    private AssetTradingService assetTradingService;



    @RequestMapping(value = "/insert",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
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
    @ResponseBody
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
    @ResponseBody
    public  Boolean deleteById(Integer id){
        return assetTradingService.deleteById(id);
    }


    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }


}
