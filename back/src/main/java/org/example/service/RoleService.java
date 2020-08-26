package org.example.service;

import org.apache.ibatis.annotations.Param;
import org.example.mapper.RoleMapper;
import org.example.pojo.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleService {
    @Resource
    private RoleMapper roleMapper;

    public List<Role> showRole(String roleName,String remarks){
        return roleMapper.showRole(roleName,remarks);
    }

    public Role getRoleId(int id){
        return roleMapper.getRoleId(id);
    }

    public int updateRole(String roleName,String remarks,int id) {
        return roleMapper.updateRole(roleName,remarks,id);
    }


    public int addRole(String roleName,String remarks){
        return roleMapper.addRole(roleName,remarks);
    }

    public int deleteRole(int id){
        return roleMapper.deleteRole(id);
    }
}
