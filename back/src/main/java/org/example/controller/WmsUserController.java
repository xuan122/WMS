package org.example.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.*;
import org.example.pojo.WmsUser;
import org.example.service.WmsUserService;
import org.example.util.MD5;
import org.example.vo.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "用户管理控制器类",description = "用户管理控制器类")
public class WmsUserController {

@Autowired
private WmsUserService wmsUserService;

    @ApiOperation(value = "登录")
    @RequestMapping(value = "/loginWmsUser",method = RequestMethod.POST)
    public ResponseData<WmsUser> loginWmsUser(String wmsName, String password) {
        ResponseData responseData = new ResponseData();
        try {

            WmsUser wmsUser = wmsUserService.loginWmsUser(wmsName, MD5.getMd5(password,12));
            if(wmsUser!=null) {
                responseData.setStatus(200);
                responseData.setMessage("登录成功");
                responseData.setData(wmsUser);
            }else {
                responseData.setStatus(400);
                responseData.setMessage("登录失败");
                responseData.setData(wmsUser);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }
    @ApiOperation(value = "获取所有的用户信息")
    @RequestMapping(value = "/showWms",method = RequestMethod.GET)
    public ResponseData<List<WmsUser>>showWms(String wmsName, String job, @RequestParam(defaultValue = "0") int deptId,@RequestParam(defaultValue = "0") int roleId, int page, int pageSize){
        ResponseData responseData = new ResponseData();
        try {
            List<WmsUser> list = wmsUserService.showWms(wmsName,job,deptId,roleId,page,pageSize);
            responseData.setStatus(200);
            responseData.setMessage("查询成功");
            responseData.setData(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "修改用户密码")
    @RequestMapping(value = "/updateWmsPassword",method = RequestMethod.POST)
    public ResponseData updateWmsPassword(int id,String password){
        ResponseData responseData = new ResponseData();
        try {

            int count = wmsUserService.updateWmsPassword(id,MD5.getMd5(password,12));
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


    @ApiOperation(value = "注册")
    @RequestMapping(value = "/addWms",method = RequestMethod.POST)

    public ResponseData addWms(WmsUser wmsUser){
        ResponseData responseData = new ResponseData();
        try {
            wmsUser.setPassword(MD5.getMd5(wmsUser.getPassword(),12));
            int count = wmsUserService.addWms(wmsUser);
            if(count>0) {
                responseData.setStatus(200);
                responseData.setMessage("添加成功");
                responseData.setData(count);
            }else {
                responseData.setStatus(400);
                responseData.setMessage("添加失败");
                responseData.setData(count);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "修改登录次数")
    @RequestMapping(value = "/updateLoginTime",method = RequestMethod.POST)
    public ResponseData updateLoginTime(int id){
        ResponseData responseData = new ResponseData();
        int count = wmsUserService.updateLoginTime(id);
        try {
            if (count > 0) {
                responseData.setStatus(200);
                responseData.setMessage("修改成功");
                responseData.setData(count);
            } else {
                responseData.setStatus(400);
                responseData.setMessage("修改失败");
                responseData.setData(count);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "修改用户信息")
    @RequestMapping(value = "/updateWmsUser",method = RequestMethod.POST)
    public ResponseData updateWmsUser(WmsUser wmsUser) {
        ResponseData responseData = new ResponseData();
        int count = wmsUserService.updateWmsUser(wmsUser);
        if(count>0){
            responseData.setStatus(200);
            responseData.setMessage("修改成功");
            responseData.setData(count);
        }else{
            responseData.setStatus(400);
            responseData.setMessage("修改失败");
            responseData.setData(count);
        }
        return responseData;
    }

    @ApiOperation(value = "根据id查询用户信息")
    @RequestMapping(value = "/getWmsUser",method = RequestMethod.GET)
    public ResponseData getWmsUser(int id){
        ResponseData responseData = new ResponseData();
        try {
            WmsUser wmsUser = wmsUserService.getWmsUser(id);
            if (wmsUser != null) {
                responseData.setStatus(200);
                responseData.setMessage("查询成功");
                responseData.setData(wmsUser);
            } else {
                responseData.setStatus(400);
                responseData.setMessage("查询失败");
                responseData.setData(wmsUser);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "根据id删除用户信息")
    @RequestMapping(value = "/deleteWms",method = RequestMethod.DELETE)
    public ResponseData deleteWms(int id){
        ResponseData responseData = new ResponseData();
        try {
            int count = wmsUserService.deleteWms(id);
            if (count>0) {
                responseData.setStatus(200);
                responseData.setMessage("删除成功");
                responseData.setData(count);
            } else {
                responseData.setStatus(400);
                responseData.setMessage("删除失败");
                responseData.setData(count);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return responseData;
    }





}
