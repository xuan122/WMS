package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.pojo.Dept;
import org.example.pojo.Unit;
import org.example.pojo.WmsUser;
import org.example.service.DeptService;
import org.example.service.UnitService;
import org.example.vo.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "单位管理类",description = "单位管理类")

public class UnitController {
    @Resource
    private UnitService unitService;

    @ApiOperation(value = "查询所有单位")
    @RequestMapping(value = "/showUnit",method = RequestMethod.GET)
    public ResponseData<Unit> showUnit(@RequestParam(defaultValue = "",required=false)String unitCode,  @RequestParam(defaultValue = "",required=false)String unitName) {
        ResponseData responseData = new ResponseData();
        try {
            List<Unit> list = unitService.showUnit(unitCode,unitName);
            responseData.setStatus(200);
            responseData.setMessage("查询成功");
            responseData.setData(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "根据id查询单位信息")
    @RequestMapping(value = "/getUnitById",method = RequestMethod.GET)
    public ResponseData getUnitById(int unitId){
        ResponseData responseData = new ResponseData();
        try {
            Unit unit = unitService.getUnitById(unitId);
            responseData.setStatus(200);
            responseData.setMessage("查询成功");
            responseData.setData(unit);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "增加单位信息")
    @RequestMapping(value = "/addUnit",method = RequestMethod.POST)
    public ResponseData addUnit(String unitCode,String unitName){
        ResponseData responseData = new ResponseData();
        try {
            int count= unitService.addUnit(unitCode,unitName);
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


    @ApiOperation(value = "修改单位信息")
    @RequestMapping(value = "/updateUnit",method = RequestMethod.PUT)
    public ResponseData updateUnit(String unitCode,String unitName,int unitId){
        ResponseData responseData = new ResponseData();
        try {
            int count= unitService.updateUnit( unitCode, unitName,unitId);
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

    @ApiOperation(value = "删除单位信息")
    @RequestMapping(value = "/deleteUnit",method = RequestMethod.DELETE)
    public ResponseData deleteUnit(int unitId){
        ResponseData responseData = new ResponseData();
        try {
            int count= unitService.deleteUnit(unitId);
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
