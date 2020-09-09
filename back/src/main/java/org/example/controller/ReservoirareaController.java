package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.mapper.ReservoirareaMapper;
import org.example.pojo.Reservoirarea;
import org.example.pojo.Storehouse;
import org.example.service.ReservoirareaServic;
import org.example.service.StorehouseService;
import org.example.vo.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "库位管理控制器类",description = "库位管理控制器类")
public class ReservoirareaController {
        @Resource
        private ReservoirareaServic reservoirareaServic;

        @ApiOperation(value = "获取所有的库位信息")
        @RequestMapping(value = "/showReservoirarea",method = RequestMethod.GET)
        public ResponseData<Reservoirarea> showReservoirarea(String areaCode, String areaName,
                                                          @RequestParam(defaultValue = "0") int storeHouseId,
                                                          @RequestParam(required=true)  int page, @RequestParam(required=true)int pageSize){
            ResponseData responseData = new ResponseData();
            try {
                List<Reservoirarea> list = reservoirareaServic.showReservoirarea(areaCode,areaName,storeHouseId,page,pageSize);
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
    @ApiOperation(value = "增加库位")
    @RequestMapping(value = "/addReservoirarea",method = RequestMethod.POST)
    public ResponseData addReservoirarea(Reservoirarea reservoirarea){
        ResponseData responseData = new ResponseData();
        try {

            int count = reservoirareaServic.addReservoirarea(reservoirarea);
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
    @ApiOperation(value = "修改库位")
    @RequestMapping(value = "/updateReservoirarea",method = RequestMethod.PUT)
    public ResponseData updateReservoirarea(Reservoirarea reservoirarea){
        ResponseData responseData = new ResponseData();
        try {

            int count = reservoirareaServic.updateReservoirarea(reservoirarea);
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

    @ApiOperation(value = "根据id查询库位")
    @RequestMapping(value = "/getReservoirareaById",method = RequestMethod.GET)
    public ResponseData getReservoirareaById( int id){
        ResponseData responseData = new ResponseData();
        try {

            Reservoirarea reservoirarea = reservoirareaServic.getReservoirareaById(id);
            if(reservoirarea!=null) {
                responseData.setStatus(200);
                responseData.setMessage("查询成功");
                responseData.setData(reservoirarea);
            }else {
                responseData.setStatus(400);
                responseData.setMessage("查询失败");
                responseData.setData(reservoirarea);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }
    @ApiOperation(value = "删除库位")
    @RequestMapping(value = "/deleteReservoirarea",method = RequestMethod.DELETE)
    public ResponseData deleteReservoirarea(int id){
        ResponseData responseData = new ResponseData();
        try {

            int count  = reservoirareaServic.deleteReservoirarea(id);
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
    @ApiOperation(value = "查询默认库位")
    @RequestMapping(value = "/defaultReservoirarea",method = RequestMethod.GET)
    public ResponseData defaultReservoirarea(int storeHouseId) {
        ResponseData responseData = new ResponseData();
        try {

            Reservoirarea reservoirarea  = reservoirareaServic.defaultReservoirarea(storeHouseId);
            if(reservoirarea!=null) {
                responseData.setStatus(200);
                responseData.setMessage("查询成功");
                responseData.setData(reservoirarea);
            }else {
                responseData.setStatus(400);
                responseData.setMessage("查询失败");
                responseData.setData(reservoirarea);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseData;
    }


    }
