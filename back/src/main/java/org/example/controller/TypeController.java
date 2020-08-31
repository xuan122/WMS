package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.pojo.Type;
import org.example.service.TypeService;
import org.example.vo.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "分类管理",produces = "分类")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @ApiOperation(value = "查询分类")
    @RequestMapping(value = "/getType",method = RequestMethod.GET)
    public Object TypeList(){
        ResponseData responseData=new ResponseData();
        responseData.setStatus(200);
        responseData.setMessage("查询成功！！");
        responseData.setData(typeService.selectList());
        return responseData;
    }

    @ApiOperation(value = "条件查询分类")
    @RequestMapping(value = "/queryType",method = RequestMethod.GET)
    public Object selectByCodeAndName(String statusCode,String statusName){
        ResponseData responseData=new ResponseData();
        responseData.setStatus(200);
        responseData.setMessage("查询成功！！");
        responseData.setData(typeService.selectByCodeAndName(statusCode,statusName));
        return responseData;
    }

    @ApiOperation(value = "添加分类")
    @RequestMapping(value = "/addType",method = RequestMethod.GET)
    public Object insertType(Type type){
        int i=typeService.insert(type);
        ResponseData responseData=new ResponseData();
        if(i>0){
            responseData.setStatus(200);
            responseData.setMessage("添加成功！！");
        }else {
            responseData.setStatus(300);
            responseData.setMessage("添加失败！！");
        }
        return responseData;
    }

    @ApiOperation(value = "删除分类")
    @RequestMapping(value = "/deleteType",method = RequestMethod.GET)
    public Object deleteById(int id){
        int i=typeService.deleteById(id);
        ResponseData responseData=new ResponseData();
        if(i>0){
            responseData.setStatus(200);
            responseData.setMessage("删除成功！！");
        }else {
            responseData.setStatus(300);
            responseData.setMessage("删除失败！！");
        }
        return responseData;
    }

    @ApiOperation(value = "修改分类")
    @RequestMapping(value = "/modifyType",method = RequestMethod.GET)
    public Object modifyById( Type type){
        int i=typeService.modifyById(type);
        ResponseData responseData=new ResponseData();
        if(i>0){
            responseData.setStatus(200);
            responseData.setMessage("编辑成功！！");
        }else {
            responseData.setStatus(300);
            responseData.setMessage("编辑失败！！");
        }
        return responseData;
    }

}
