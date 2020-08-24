package org.example.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Dept implements java.io.Serializable {
    private int id;
    private String deptName;
    private String superiorDept;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date create_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSuperiorDept() {
        return superiorDept;
    }

    public void setSuperiorDept(String superiorDept) {
        this.superiorDept = superiorDept;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
