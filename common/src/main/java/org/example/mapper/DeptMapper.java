package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
<<<<<<< HEAD
=======
import org.apache.ibatis.annotations.Param;
>>>>>>> dd1282c... first commit
import org.example.pojo.Dept;

import java.util.List;

@Mapper
public interface DeptMapper {
<<<<<<< HEAD
    public List<Dept> showDept();
}
=======
    public List<Dept> showDept(@Param("deptName")String deptName,@Param("remarks")String remarks);  //条件查询部门信息

    public Dept getDeptId(@Param("id")int id);

    public int addDept(@Param("deptName")String deptName,@Param("remarks")String remarks);

    public int updateDept(@Param("deptName")String deptName,@Param("remarks")String remarks,@Param("id") int id);

    public int deleteDept(@Param("id")int id);


}
>>>>>>> dd1282c... first commit
