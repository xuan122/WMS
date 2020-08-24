package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Role;

import java.util.List;
@Mapper
public interface RoleMapper {
    public List<Role> showRole();
}
