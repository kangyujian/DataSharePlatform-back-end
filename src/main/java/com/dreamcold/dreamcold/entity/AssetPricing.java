package com.dreamcold.dreamcold.entity;

import java.sql.Timestamp;

public class AssetPricing {
    private  int id;
    private String dataChecker;
    private Timestamp dataPriceDecideTime;
    private String dataSize;
    private String dataValue;
    private boolean isOnline;

    public AssetPricing(int id, String dataChecker, Timestamp dataPriceDecideTime, String dataSize, String dataValue, boolean isOnline) {
        this.id = id;
        this.dataChecker = dataChecker;
        this.dataPriceDecideTime = dataPriceDecideTime;
        this.dataSize = dataSize;
        this.dataValue = dataValue;
        this.isOnline = isOnline;
    }

    public AssetPricing(String dataChecker, Timestamp dataPriceDecideTime, String dataSize, String dataValue, boolean isOnline) {
        this.dataChecker = dataChecker;
        this.dataPriceDecideTime = dataPriceDecideTime;
        this.dataSize = dataSize;
        this.dataValue = dataValue;
        this.isOnline = isOnline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataChecker() {
        return dataChecker;
    }

    public void setDataChecker(String dataChecker) {
        this.dataChecker = dataChecker;
    }

    public Timestamp getDataPriceDecideTime() {
        return dataPriceDecideTime;
    }

    public void setDataPriceDecideTime(Timestamp dataPriceDecideTime) {
        this.dataPriceDecideTime = dataPriceDecideTime;
    }

    public String getDataSize() {
        return dataSize;
    }

    public void setDataSize(String dataSize) {
        this.dataSize = dataSize;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}


