package org.example.service;

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
}
