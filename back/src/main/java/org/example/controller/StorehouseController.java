package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.pojo.Storehouse;
import org.example.pojo.WmsUser;
import org.example.service.StorehouseService;
import org.example.util.MD5;
import org.example.vo.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@Api(value = "仓库管理控制器类",description = "仓库管理控制器类")
public class StorehouseController {
        @Resource
        private StorehouseService storehouseService;

        @ApiOperation(value = "获取所有的仓库信息")
        @RequestMapping(value = "/showStorehouse",method = RequestMethod.GET)
        public ResponseData<Storehouse> showStorehouse(String storeHouseCode, String storeHouseName,
                                                       @RequestParam(defaultValue = "0") int storeHouseDepartmentId, @RequestParam(defaultValue = "0") int storeHouseType,
                                                       @RequestParam(required=true)  int page,  @RequestParam(required=true)int pageSize){
            ResponseData responseData = new ResponseData();
            try {
                List<Storehouse> list = storehouseService.showStorehouse(storeHouseCode,storeHouseName,storeHouseDepartmentId,storeHouseType,page,pageSize);
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
    @ApiOperation(value = "增加仓库")
    @RequestMapping(value = "/addStorehouse",method = RequestMethod.POST)
    public ResponseData addStorehouse(Storehouse storehouse){
        ResponseData responseData = new ResponseData();
        try {

            int count = storehouseService.addStorehouse(storehouse);
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
    @ApiOperation(value = "修改仓库")
    @RequestMapping(value = "/updateStorehouse",method = RequestMethod.PUT)
    public ResponseData updateStorehouse(Storehouse storehouse){
        ResponseData responseData = new ResponseData();
        try {

            int count = storehouseService.updateStorehouse(storehouse);
            if(count>0) {
                responseData.setStatus(200);
                responseData.setMessage("修改成功");
                responseData.setData(count);
            }else {
                responseData.setStatus(400);
                responseData.setMessage("修改失败");
                responseData.setData(count);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }

    @ApiOperation(value = "根据id查询仓库")
    @RequestMapping(value = "/getStorehouseById",method = RequestMethod.GET)
    public ResponseData getStorehouseById( int id){
        ResponseData responseData = new ResponseData();
        try {

            Storehouse storehouse = storehouseService.getStorehouseById(id);
            if(storehouse!=null) {
                responseData.setStatus(200);
                responseData.setMessage("查询成功");
                responseData.setData(storehouse);
            }else {
                responseData.setStatus(400);
                responseData.setMessage("查询失败");
                responseData.setData(storehouse);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }
    @ApiOperation(value = "删除仓库")
    @RequestMapping(value = "/deleteStorehouse",method = RequestMethod.DELETE)
    public ResponseData deleteStorehouse( int id){
        ResponseData responseData = new ResponseData();
        try {

            int count  = storehouseService.deleteStorehouse(id);
            if(count>0) {
                responseData.setStatus(200);
                responseData.setMessage("删除成功");
                responseData.setData(count);
            }else {
                responseData.setStatus(400);
                responseData.setMessage("删除失败");
                responseData.setData(count);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }
    @ApiOperation(value = "查询默认仓库")
    @RequestMapping(value = "/defaultStorehouse",method = RequestMethod.GET)
    public ResponseData defaultStorehouse() {
        ResponseData responseData = new ResponseData();
        try {

            Storehouse storehouse  = storehouseService.defaultStorehouse();
            if(storehouse!=null) {
                responseData.setStatus(200);
                responseData.setMessage("查询成功");
                responseData.setData(storehouse);
            }else {
                responseData.setStatus(400);
                responseData.setMessage("查询失败");
                responseData.setData(storehouse);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }


    }
