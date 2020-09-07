package org.example.pojo;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;

=======
>>>>>>> dd1282c... first commit
import java.util.Date;

public class Dept implements java.io.Serializable {
    private int id;
    private String deptName;
<<<<<<< HEAD
    private String superiorDept;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date create_time;

=======
    private String remarks;
    private Date create_time;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

>>>>>>> dd1282c... first commit
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

<<<<<<< HEAD
    public String getSuperiorDept() {
        return superiorDept;
    }

    public void setSuperiorDept(String superiorDept) {
        this.superiorDept = superiorDept;
    }

=======
>>>>>>> dd1282c... first commit
    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
