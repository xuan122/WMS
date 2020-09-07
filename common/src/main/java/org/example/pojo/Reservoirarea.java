package org.example.pojo;

import java.sql.Date;

public class Reservoirarea implements java.io.Serializable {
    private int id;
    private String areaCode;
    private String areaName;
    private int areaType;
    private int storeHouseId;
    private int disable;
    private int defaults;
    private String remarks;
    private Date creationDate;
    private int creationBy;
    private Date modifyDate;
    private int modifyBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getAreaType() {
        return areaType;
    }

    public void setAreaType(int areaType) {
        this.areaType = areaType;
    }

    public int getStoreHouseId() {
        return storeHouseId;
    }

    public void setStoreHouseId(int storeHouseId) {
        this.storeHouseId = storeHouseId;
    }

    public int getDisable() {
        return disable;
    }

    public void setDisable(int disable) {
        this.disable = disable;
    }

    public int getDefaults() {
        return defaults;
    }

    public void setDefaults(int defaults) {
        this.defaults = defaults;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getCreationBy() {
        return creationBy;
    }

    public void setCreationBy(int creationBy) {
        this.creationBy = creationBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public int getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(int modifyBy) {
        this.modifyBy = modifyBy;
    }
}
