package org.example.service;

import org.apache.ibatis.annotations.Param;
import org.example.mapper.DeptMapper;
import org.example.mapper.RoleMapper;
import org.example.pojo.Dept;
import org.example.pojo.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptService {
    @Resource
    private DeptMapper deptMapper;

    public List<Dept> showDept(){
        return deptMapper.showDept();
    }

    public List<Dept> showDept(String deptName, String remarks){
        return deptMapper.showDept(deptName,remarks);
    }
    public Dept getDeptId(int id){
        return deptMapper.getDeptId(id);
    }

    public int addDept(String deptName, String remarks){
        return deptMapper.addDept(deptName,remarks);
    }


    public int updateDept(String deptName,String remarks,int id){
        return deptMapper.updateDept(deptName,remarks,id);
    }

    public int deleteDept(int id){
        return deptMapper.deleteDept(id);
    }

}
