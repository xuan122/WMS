package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.pojo.Dept;
import org.example.pojo.Role;
import org.example.pojo.WmsUser;
import org.example.service.DeptService;
import org.example.service.RoleService;
import org.example.vo.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "部门管理类")
public class DeptController {
    @Resource
    private DeptService deptService;

    @ApiOperation(value = "查询所有部门")
    @RequestMapping(value = "/showDept",method = RequestMethod.GET)
    public ResponseData<WmsUser> showDept() {
        ResponseData responseData = new ResponseData();
        try {
            List<Dept> list = deptService.showDept();
            responseData.setStatus(200);
            responseData.setMessage("查询成功");
            responseData.setData(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }


}
