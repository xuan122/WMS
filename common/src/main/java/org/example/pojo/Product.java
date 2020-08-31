package org.example.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class Product {

    private int productId;
    private String productName;
    private String productCode;
    private String contractorCode;
    private String internalCode;
    private String productSpecifications;
    private int productType;
    private int unitId;
    private Float unitPrice;
    private int packingType;
    private Float weight;
    private int upWarning;
    private int downWarning;
    private int providerId;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date creationDate;
    private int creationBy;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date modifyDate;
    private int modifyBy;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getContractorCode() {
        return contractorCode;
    }

    public void setContractorCode(String contractorCode) {
        this.contractorCode = contractorCode;
    }

    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public String getProductSpecifications() {
        return productSpecifications;
    }

    public void setProductSpecifications(String productSpecifications) {
        this.productSpecifications = productSpecifications;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getPackingType() {
        return packingType;
    }

    public void setPackingType(int packingType) {
        this.packingType = packingType;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public int getUpWarning() {
        return upWarning;
    }

    public void setUpWarning(int upWarning) {
        this.upWarning = upWarning;
    }

    public int getDownWarning() {
        return downWarning;
    }

    public void setDownWarning(int downWarning) {
        this.downWarning = downWarning;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
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
