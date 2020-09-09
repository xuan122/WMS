package org.example.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class Storehouse implements java.io.Serializable {
    private int id;
    private String storeHouseCode;
    private String storeHouseName;
    private int storeHouseDepartmentId;
    private int storeHouseType;
    private int storeHouseDefault;
    private int storeHouseDisable;
    private String storeHouseFunction;
    @JsonFormat(pattern ="yyyy-MM-dd",timezone = "GMT+8")
    private Date leaseDate;
    private int area;
    private String address;
    private String contacts;
    private String phone;
    @JsonFormat(pattern ="yyyy-MM-dd",timezone = "GMT+8")
    private Date creationDate;
    private String creationBy;
    @JsonFormat(pattern ="yyyy-MM-dd",timezone = "GMT+8")
    private Date modifyDaete;
    private String modifyBy;

    public void setId(int id) {
        this.id = id;
    }

    public void setStoreHouseCode(String storeHouseCode) {
        this.storeHouseCode = storeHouseCode;
    }

    public void setStoreHouseName(String storeHouseName) {
        this.storeHouseName = storeHouseName;
    }

    public void setStoreHouseDepartmentId(int storeHouseDepartmentId) {
        this.storeHouseDepartmentId = storeHouseDepartmentId;
    }

    public void setStoreHouseType(int storeHouseType) {
        this.storeHouseType = storeHouseType;
    }

    public void setStoreHouseDefault(int storeHouseDefault) {
        this.storeHouseDefault = storeHouseDefault;
    }

    public void setStoreHouseDisable(int storeHouseDisable) {
        this.storeHouseDisable = storeHouseDisable;
    }

    public void setStoreHouseFunction(String storeHouseFunction) {
        this.storeHouseFunction = storeHouseFunction;
    }

    public void setLeaseDate(Date leaseDate) {
        this.leaseDate = leaseDate;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setCreationBy(String creationBy) {
        this.creationBy = creationBy;
    }

    public void setModifyDaete(Date modifyDaete) {
        this.modifyDaete = modifyDaete;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public int getId() {
        return id;
    }

    public String getStoreHouseCode() {
        return storeHouseCode;
    }

    public String getStoreHouseName() {
        return storeHouseName;
    }

    public int getStoreHouseDepartmentId() {
        return storeHouseDepartmentId;
    }

    public int getStoreHouseType() {
        return storeHouseType;
    }

    public int getStoreHouseDefault() {
        return storeHouseDefault;
    }

    public int getStoreHouseDisable() {
        return storeHouseDisable;
    }

    public String getStoreHouseFunction() {
        return storeHouseFunction;
    }

    public Date getLeaseDate() {
        return leaseDate;
    }

    public int getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

    public String getContacts() {
        return contacts;
    }

    public String getPhone() {
        return phone;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getCreationBy() {
        return creationBy;
    }

    public Date getModifyDaete() {
        return modifyDaete;
    }

    public String getModifyBy() {
        return modifyBy;
    }
}
