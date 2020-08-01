package com.dreamcold.dreamcold.entity;

import java.util.Date;

public class AssetPricing {
    private Integer id;

    private String datacheacker;

    private Date datapricedecidetime;

    private String datasize;

    private String datavalue;

    private Boolean isonline;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatacheacker() {
        return datacheacker;
    }

    public void setDatacheacker(String datacheacker) {
        this.datacheacker = datacheacker == null ? null : datacheacker.trim();
    }

    public Date getDatapricedecidetime() {
        return datapricedecidetime;
    }

    public void setDatapricedecidetime(Date datapricedecidetime) {
        this.datapricedecidetime = datapricedecidetime;
    }

    public String getDatasize() {
        return datasize;
    }

    public void setDatasize(String datasize) {
        this.datasize = datasize == null ? null : datasize.trim();
    }

    public String getDatavalue() {
        return datavalue;
    }

    public void setDatavalue(String datavalue) {
        this.datavalue = datavalue == null ? null : datavalue.trim();
    }

    public Boolean getIsonline() {
        return isonline;
    }

    public void setIsonline(Boolean isonline) {
        this.isonline = isonline;
    }
}