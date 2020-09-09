package org.example.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.pojo.Carrier;
import org.example.service.CarrierService;
import org.example.vo.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "承运商管理类")
public class CarrierController {

    @Autowired
    private CarrierService carrierService;

    @RequestMapping(value = "/getCarrier",method = RequestMethod.GET)
    @ApiOperation(value = "查询承运商")
    public Object getCarrier(){
        ResponseData responseData = new ResponseData();
        responseData.setStatus(200);
        responseData.setMessage("查询成功");
        responseData.setData(carrierService.getCarrierList());
        return responseData;
    }

    @RequestMapping(value = "/queryByCodeAndName",method = RequestMethod.GET)
    @ApiOperation(value = "按条件查询承运商")
    public Object queryByCodeAndName(String carrierCode,String carrierName){
        ResponseData responseData = new ResponseData();
        responseData.setStatus(200);
        responseData.setMessage("查询成功");
        responseData.setData(carrierService.queryByCodeAndName(carrierCode,carrierName));
        return responseData;
    }

    @RequestMapping(value = "/addCarrier",method = RequestMethod.POST)
    @ApiOperation(value = "添加承运商")
    public Object addCarrier(Carrier carrier){
        ResponseData responseData = new ResponseData();
        int i=carrierService.insertCarrier(carrier);
        if(i>0){
            responseData.setStatus(200);
            responseData.setMessage("添加成功");
        }else {
            responseData.setStatus(300);
            responseData.setMessage("添加失败");
        }
        return responseData;
    }

    @RequestMapping(value = "/modifyCarrier",method = RequestMethod.PUT)
    @ApiOperation(value = "修改承运商")
    public Object modifyCarrier(Carrier carrier){
        ResponseData responseData = new ResponseData();
        int i=carrierService.modifyCarrier(carrier);
        if(i>0){
            responseData.setStatus(200);
            responseData.setMessage("修改成功");
        }else {
            responseData.setStatus(300);
            responseData.setMessage("修改失败");
        }
        return responseData;
    }
    @RequestMapping(value = "/deleteCarrier",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除承运商")
    public Object deleteCarrier(int id){
        ResponseData responseData = new ResponseData();
        int i=carrierService.deleteById(id);
        if(i>0){
            responseData.setStatus(200);
            responseData.setMessage("删除成功");
        }else {
            responseData.setStatus(300);
            responseData.setMessage("删除失败");
        }
        return responseData;
    }
}
