package org.example.pojo;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;

=======
>>>>>>> dd1282c... first commit
import java.util.Date;

public class Role implements java.io.Serializable{
    private int id;
    private String roleName;
<<<<<<< HEAD
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
=======
>>>>>>> dd1282c... first commit
    private Date create_time;
    private String remarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
