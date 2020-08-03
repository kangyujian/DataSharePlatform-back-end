package com.dreamcold.dreamcold.controller;


import com.dreamcold.dreamcold.entity.AssetPricing;
import com.dreamcold.dreamcold.service.AssetPricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Date;


@Controller
@RequestMapping("/assetPricing")
public class AssetPricingController {


    @Autowired
    private AssetPricingService assetPricingService;

    @RequestMapping(value = "/insert",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Boolean insertIntoAssetPricing(String datacheacker,Date datapricedecidetime,String datasize,String datavalue,Boolean isonline){
        AssetPricing assetPricing=new AssetPricing();
        assetPricing.setDatacheacker(datacheacker);
        assetPricing.setDatasize(datasize);
        assetPricing.setDatavalue(datavalue);
        assetPricing.setDatapricedecidetime(datapricedecidetime);
        assetPricing.setIsonline(isonline);
        assetPricingService.insertIntoAssetPricing(assetPricing);
        return assetPricingService.insertIntoAssetPricing(assetPricing);
    }

    @RequestMapping("/findAll")
    @ResponseBody
    List<AssetPricing> findAll(){
        return assetPricingService.findAll();
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Boolean updateById(Integer id,String datacheacker,Date datapricedecidetime,String datasize,String datavalue,Boolean isonline){
        AssetPricing assetPricing=new AssetPricing();
        assetPricing.setDatacheacker(datacheacker);
        assetPricing.setDatasize(datasize);
        assetPricing.setDatavalue(datavalue);
        assetPricing.setDatapricedecidetime(datapricedecidetime);
        assetPricing.setIsonline(isonline);
        assetPricing.setId(id);
        return  assetPricingService.updateById(assetPricing);
    }


    @RequestMapping(value = "/delete",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public  Boolean deleteById(Integer id){
        return assetPricingService.deleteById(id);
    }


}
