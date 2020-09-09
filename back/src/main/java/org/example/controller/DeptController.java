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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "部门管理类",description ="部门管理类")
public class DeptController {
    @Resource
    private DeptService deptService;

    @ApiOperation(value = "查询所有部门")
    @RequestMapping(value = "/showDept",method = RequestMethod.GET)
    public ResponseData<WmsUser> showDept(@RequestParam(defaultValue = "",required=false)String deptName, @RequestParam(defaultValue = "",required=false)String remarks) {
        ResponseData responseData = new ResponseData();
        try {
            List<Dept> list = deptService.showDept(deptName,remarks);
            responseData.setStatus(200);
            responseData.setMessage("查询成功");
            responseData.setData(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "根据id查询部门信息")
    @RequestMapping(value = "/getDeptId",method = RequestMethod.GET)
    public ResponseData getDeptId(int id){
        ResponseData responseData = new ResponseData();
        try {
            Dept dept = deptService.getDeptId(id);
            responseData.setStatus(200);
            responseData.setMessage("查询成功");
            responseData.setData(dept);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "增加部门信息")
    @RequestMapping(value = "/addDept",method = RequestMethod.POST)
    public ResponseData addDept(String deptName, String remarks){
        ResponseData responseData = new ResponseData();
        try {
            int count= deptService.addDept(deptName,remarks);
            if(count>0) {
                responseData.setStatus(200);
                responseData.setMessage("增加成功");
                responseData.setData(count);
            }else{
                responseData.setStatus(400);
                responseData.setMessage("增加失败");
                responseData.setData(count);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }


    @ApiOperation(value = "修改部门信息")
    @RequestMapping(value = "/updateDept",method = RequestMethod.PUT)
    public ResponseData updateDept(String deptName,String remarks,int id){
        ResponseData responseData = new ResponseData();
        try {
            int count= deptService.updateDept(deptName,remarks,id);
            if(count>0) {
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

    @ApiOperation(value = "删除部门信息")
    @RequestMapping(value = "/deleteDept",method = RequestMethod.DELETE)
    public ResponseData deleteDept(int id){
        ResponseData responseData = new ResponseData();
        try {
            int count= deptService.deleteDept(id);
            if(count>0) {
                responseData.setStatus(200);
                responseData.setMessage("删除成功");
                responseData.setData(count);
            }else{
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
