package com.dreamcold.dreamcold.controller;


import com.dreamcold.dreamcold.entity.AssetStatus;
import com.dreamcold.dreamcold.service.AssetStatusService;
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
import java.util.List;
import java.util.Date;



@Controller
@RequestMapping("/assetStatus")
public class AssetStatusController {


    @Autowired
    private AssetStatusService assetStatusService;

    @RequestMapping(value = "/insert",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
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
    @ResponseBody
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
    @ResponseBody
    public  Boolean deleteById(Integer id){
        return assetStatusService.deleteById(id);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }


}
