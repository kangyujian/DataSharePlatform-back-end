package com.dreamcold.dreamcold.entity;

public class AssetTrading {
    private Integer id;

    private String owner;

    private String users;

    private String tradetime;

    private String datatheme;

    private String datavalue;

    private String datasize;

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

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users == null ? null : users.trim();
    }

    public String getTradetime() {
        return tradetime;
    }

    public void setTradetime(String tradetime) {
        this.tradetime = tradetime == null ? null : tradetime.trim();
    }

    public String getDatatheme() {
        return datatheme;
    }

    public void setDatatheme(String datatheme) {
        this.datatheme = datatheme == null ? null : datatheme.trim();
    }

    public String getDatavalue() {
        return datavalue;
    }

    public void setDatavalue(String datavalue) {
        this.datavalue = datavalue == null ? null : datavalue.trim();
    }

    public String getDatasize() {
        return datasize;
    }

    public void setDatasize(String datasize) {
        this.datasize = datasize == null ? null : datasize.trim();
    }

    public Boolean getIsonline() {
        return isonline;
    }

    public void setIsonline(Boolean isonline) {
        this.isonline = isonline;
    }
}