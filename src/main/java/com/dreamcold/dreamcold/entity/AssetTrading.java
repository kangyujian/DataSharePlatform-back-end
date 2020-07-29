package com.dreamcold.dreamcold.entity;

import java.sql.Timestamp;

public class AssetTrading {
    private int id;
    private String owner;
    private String users;
    private Timestamp tradeTime;
    private String dataTheme;
    private String dataValue;
    private String dataSize;
    private boolean isonline;

    public AssetTrading(int id, String owner, String users, Timestamp tradeTime, String dataTheme, String dataValue, String dataSize, boolean isonline) {
        this.id = id;
        this.owner = owner;
        this.users = users;
        this.tradeTime = tradeTime;
        this.dataTheme = dataTheme;
        this.dataValue = dataValue;
        this.dataSize = dataSize;
        this.isonline = isonline;
    }

    public AssetTrading(String owner, String users, Timestamp tradeTime, String dataTheme, String dataValue, String dataSize, boolean isonline) {
        this.owner = owner;
        this.users = users;
        this.tradeTime = tradeTime;
        this.dataTheme = dataTheme;
        this.dataValue = dataValue;
        this.dataSize = dataSize;
        this.isonline = isonline;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public Timestamp getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Timestamp tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getDataTheme() {
        return dataTheme;
    }

    public void setDataTheme(String dataTheme) {
        this.dataTheme = dataTheme;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getDataSize() {
        return dataSize;
    }

    public void setDataSize(String dataSize) {
        this.dataSize = dataSize;
    }

    public boolean isIsonline() {
        return isonline;
    }

    public void setIsonline(boolean isonline) {
        this.isonline = isonline;
    }
}
