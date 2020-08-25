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
        System.out.println(typeService.selectList().get(0).getCreationDate());
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

}
