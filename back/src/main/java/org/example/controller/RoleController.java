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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.Null;
import java.util.List;

@RestController
@Api(value = "角色管理类")
public class RoleController {
    @Resource
    private RoleService roleService;

    @ApiOperation(value = "条件所有角色")
    @RequestMapping(value = "/showRole",method = RequestMethod.GET)
    public ResponseData<WmsUser> showRole(@RequestParam(defaultValue = "",required=false)String roleName, @RequestParam(defaultValue = "",required=false) String remarks) {
        ResponseData responseData = new ResponseData();
        try {
            List<Role> list = roleService.showRole(roleName,remarks);
            responseData.setStatus(200);
            responseData.setMessage("查询成功");
            responseData.setData(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "根据id查询角色")
    @RequestMapping(value = "/getRoleId",method = RequestMethod.GET)
    public ResponseData getRoleId(int id){
        ResponseData responseData = new ResponseData();
        try {
            Role role = roleService.getRoleId(id);
            responseData.setStatus(200);
            responseData.setMessage("查询成功");
            responseData.setData(role);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "修改角色信息")
    @RequestMapping(value = "/updateRole",method = RequestMethod.PUT)
    public ResponseData updateRole(String roleName,String remarks,int id) {
        ResponseData responseData = new ResponseData();
        try {
            int count = roleService.updateRole(roleName,remarks,id);
            if(count>0){
                responseData.setStatus(200);
                responseData.setMessage("修改成功");
                responseData.setData(count);
            }else{
                responseData.setStatus(400);
                responseData.setMessage("修改失败");
                responseData.setData(count);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }


    @ApiOperation(value = "增加角色信息")
    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    public ResponseData addRole(String roleName,String remarks) {
        ResponseData responseData = new ResponseData();
        try {
            int count = roleService.addRole(roleName,remarks);
            if (count > 0) {
                responseData.setStatus(200);
                responseData.setMessage("增加成功");
                responseData.setData(count);
            } else {
                responseData.setStatus(400);
                responseData.setMessage("增加失败");
                responseData.setData(count);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;

    }
    @ApiOperation(value = "删除角色信息")
    @RequestMapping(value = "/deleteRole",method = RequestMethod.DELETE)
    public ResponseData deleteRole(int id){
        ResponseData responseData = new ResponseData();
        try {
            int count = roleService.deleteRole(id);
            if (count > 0) {
                responseData.setStatus(200);
                responseData.setMessage("删除成功");
                responseData.setData(count);
            } else {
                responseData.setStatus(400);
                responseData.setMessage("删除失败");
                responseData.setData(count);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }



}
