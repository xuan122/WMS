package org.example.service;

import org.example.mapper.RoleMapper;
import org.example.pojo.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleService {
    @Resource
    private RoleMapper roleMapper;

    public List<Role> showRole(){
        return roleMapper.showRole();
    }
}
