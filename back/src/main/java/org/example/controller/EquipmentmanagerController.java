package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.pojo.Dept;
import org.example.pojo.Equipmentmanager;
import org.example.pojo.WmsUser;
import org.example.service.DeptService;
import org.example.service.EquipmentmanagerService;
import org.example.util.MD5;
import org.example.vo.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "设备管理类",description ="设备管理类")
public class EquipmentmanagerController {
    @Resource
    private EquipmentmanagerService equipmentmanagerService;

    @ApiOperation(value = "查询所有设备")
    @RequestMapping(value = "/showEquipmentmanager",method = RequestMethod.GET)
    public ResponseData<Equipmentmanager> showEquipmentmanager(String equipmentCode, String equipmentName, @RequestParam(required=true)  int page, @RequestParam(required=true)  int pageSize) {
        ResponseData responseData = new ResponseData();
        try {
            List<Equipmentmanager> list = equipmentmanagerService.showEquipmentmanager(equipmentCode,equipmentName,page,pageSize);
            if(list.size()!=0) {
                responseData.setStatus(200);
                responseData.setMessage("查询成功");
                responseData.setData(list);
            }else {
                responseData.setStatus(222);
                responseData.setMessage("list值为空");
                responseData.setData(list);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "根据id查询设备信息")
    @RequestMapping(value = "/getEquipmentmanagerById",method = RequestMethod.GET)
    public ResponseData getEquipmentmanagerById(int id){
        ResponseData responseData = new ResponseData();
        try {
            Equipmentmanager equipmentmanager = equipmentmanagerService.getEquipmentmanagerById(id);
            responseData.setStatus(200);
            responseData.setMessage("查询成功");
            responseData.setData(equipmentmanager);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "增加设备信息")
    @RequestMapping(value = "/addEquipmentmanager",method = RequestMethod.POST)
    public ResponseData addEquipmentmanager(Equipmentmanager equipmentmanager){
        ResponseData responseData = new ResponseData();
        try {
            if(equipmentmanager.getAuthorizationIdentifier()!=""&&equipmentmanager.getAuthorizationIdentifier()!=null){
                equipmentmanager.setAuthorizationIdentifier(MD5.getMd5(equipmentmanager.getAuthorizationIdentifier(),32));
            }
            int count= equipmentmanagerService.addEquipmentmanager(equipmentmanager);
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


    @ApiOperation(value = "修改设备信息")
    @RequestMapping(value = "/updateEquipmentmanager",method = RequestMethod.PUT)
    public ResponseData updateEquipmentmanager(Equipmentmanager equipmentmanager){
        ResponseData responseData = new ResponseData();
        try {

            if(equipmentmanager.getAuthorizationIdentifier()!=""&&equipmentmanager.getAuthorizationIdentifier()!=null){
                equipmentmanager.setAuthorizationIdentifier(MD5.getMd5(equipmentmanager.getAuthorizationIdentifier(),32));
            }
            int count= equipmentmanagerService.updateEquipmentmanager(equipmentmanager);
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

    @ApiOperation(value = "删除设备信息")
    @RequestMapping(value = "/deleteEquipmentmanager",method = RequestMethod.DELETE)
    public ResponseData deleteEquipmentmanager(int id){
        ResponseData responseData = new ResponseData();
        try {
            int count= equipmentmanagerService.deleteEquipmentmanager(id);
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
