package com.dreamcold.dreamcold.entity;

import java.util.Date;

public class AssetStatus {
    private Integer id;

    private String owner;

    private Date datastarttime;

    private String datatheme;

    private String datasize;

    private String blockversion;

    private String datainbloackid;

    private Boolean isonline;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public Date getDatastarttime() {
        return datastarttime;
    }

    public void setDatastarttime(Date datastarttime) {
        this.datastarttime = datastarttime;
    }

    public String getDatatheme() {
        return datatheme;
    }

    public void setDatatheme(String datatheme) {
        this.datatheme = datatheme == null ? null : datatheme.trim();
    }

    public String getDatasize() {
        return datasize;
    }

    public void setDatasize(String datasize) {
        this.datasize = datasize == null ? null : datasize.trim();
    }

    public String getBlockversion() {
        return blockversion;
    }

    public void setBlockversion(String blockversion) {
        this.blockversion = blockversion == null ? null : blockversion.trim();
    }

    public String getDatainbloackid() {
        return datainbloackid;
    }

    public void setDatainbloackid(String datainbloackid) {
        this.datainbloackid = datainbloackid == null ? null : datainbloackid.trim();
    }

    public Boolean getIsonline() {
        return isonline;
    }

    public void setIsonline(Boolean isonline) {
        this.isonline = isonline;
    }
}