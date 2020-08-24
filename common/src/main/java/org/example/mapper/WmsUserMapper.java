package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.pojo.WmsUser;

import javax.annotation.security.PermitAll;
import java.util.List;

@Mapper
public interface WmsUserMapper {

    public WmsUser loginWmsUser(@Param("wmsName")String wmsName,@Param("password")String password);  //用户登录

    public List<WmsUser> showWms(@Param("wmsName")String wmsName, @Param("job")String job, @Param("deptId")int deptId, @Param("roleId")int roleId, @Param("page")int page,@Param("pageSize")int pageSize) ;  //查询所有员工信息

    public int updateWmsPassword(@Param("id")int id,@Param("password")String password);  //根据id修改密码

    public int addWms(WmsUser wmsUser); //注册

    public int updateLoginTime(@Param("id")int id);  //修改登录次数

    public int updateWmsUser(WmsUser wmsUser);  //修改用户信息

    public WmsUser getWmsUser(@Param("id")int id);

    public int deleteWms(@Param("id")int id);

}
