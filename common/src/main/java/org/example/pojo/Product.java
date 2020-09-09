package org.example.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class Product {

    private int productId;//产品id
    private String productName;//产品名称
    private String productCode;//产品编码
    private String contractorCode;//厂商编码
    private String internalCode;//内部编码
    private String productSpecifications;//产品规格
    private int productType;//产品类别
    private int unitId;//单位
    private String unitName;//单位名
    private Float unitPrice;//单价
    private int count;//数量
    private int totalPrice;//总额
    private int packingType;//包装类型
    private Float weight;//重量
    private int upWarning;//预警上限
    private int downWarning;//预警下限
    private int providerId;//供应商id
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

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
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
