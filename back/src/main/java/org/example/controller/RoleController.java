package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.pojo.Role;
import org.example.pojo.WmsUser;
import org.example.service.RoleService;
import org.example.util.MD5;
import org.example.vo.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "角色管理类")
public class RoleController {
    @Resource
    private RoleService roleService;

    @ApiOperation(value = "查询所有角色")
    @RequestMapping(value = "/showRole",method = RequestMethod.GET)
    public ResponseData<WmsUser> showRole() {
        ResponseData responseData = new ResponseData();
        try {
            List<Role> list = roleService.showRole();
            responseData.setStatus(200);
            responseData.setMessage("查询成功");
            responseData.setData(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }


}
