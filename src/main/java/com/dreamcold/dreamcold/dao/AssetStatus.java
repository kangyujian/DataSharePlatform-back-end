package com.dreamcold.dreamcold.dao;

import java.sql.Timestamp;

public class AssetStatus {
    private  int id;
    private String owner;
    private Timestamp dataStartTime;
    private String dataTheme;
    private String dataSize;
    private String blockVersion;
    private String dataBlockId;
    private boolean isOnline;

    public AssetStatus(int id, String owner, Timestamp dataStartTime, String dataTheme, String dataSize, String blockVersion, String dataBlockId, boolean isOnline) {
        this.id = id;
        this.owner = owner;
        this.dataStartTime = dataStartTime;
        this.dataTheme = dataTheme;
        this.dataSize = dataSize;
        this.blockVersion = blockVersion;
        this.dataBlockId = dataBlockId;
        this.isOnline = isOnline;
    }

    public AssetStatus(String owner, Timestamp dataStartTime, String dataTheme, String dataSize, String blockVersion, String dataBlockId, boolean isOnline) {
        this.owner = owner;
        this.dataStartTime = dataStartTime;
        this.dataTheme = dataTheme;
        this.dataSize = dataSize;
        this.blockVersion = blockVersion;
        this.dataBlockId = dataBlockId;
        this.isOnline = isOnline;
    }


    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public Timestamp getDataStartTime() {
        return dataStartTime;
    }

    public String getDataTheme() {
        return dataTheme;
    }

    public String getDataSize() {
        return dataSize;
    }

    public String getBlockVersion() {
        return blockVersion;
    }

    public String getDataBlockId() {
        return dataBlockId;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDataStartTime(Timestamp dataStartTime) {
        this.dataStartTime = dataStartTime;
    }

    public void setDataTheme(String dataTheme) {
        this.dataTheme = dataTheme;
    }

    public void setDataSize(String dataSize) {
        this.dataSize = dataSize;
    }

    public void setBlockVersion(String blockVersion) {
        this.blockVersion = blockVersion;
    }

    public void setDataBlockId(String dataBlockId) {
        this.dataBlockId = dataBlockId;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }


}
