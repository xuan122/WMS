package org.example.pojo;




import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class Type implements java.io.Serializable{
    private int id;
    private String statusCode;
    private String statusType;
    private String statusName;
    private int parentId;
    private String parentName;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date creationDate;
    private int creationBy;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date modifyDate;
    private int modifyBy;
    private String remarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
