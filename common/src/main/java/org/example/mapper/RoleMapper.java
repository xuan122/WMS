package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.pojo.Role;

import java.util.List;
@Mapper
public interface RoleMapper {
    public List<Role> showRole(@Param("roleName")String roleName,@Param("remarks")String remarks);  //条件查询角色

    public Role getRoleId(@Param("id")int id);  //根据ID查询角色信息

    public int updateRole(@Param("roleName")String roleName,@Param("remarks")String remarks,@Param("id")int id); //修改角色信息

    public int addRole(@Param("roleName")String roleName,@Param("remarks")String remarks);

    public int deleteRole(@Param("id")int id);
}
