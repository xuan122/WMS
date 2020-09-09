package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.pojo.Product;
import org.example.service.ProductService;
import org.example.vo.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "产品管理")
public class ProductController {

    @Resource
    private ProductService productService;

    @RequestMapping(value = "/conditionGet",method = RequestMethod.GET)
    @ApiOperation(value = "条件查询产品列表")
    public Object conditionQuery(String productCode,String productName){
        List<Product> pList=productService.conditionQuery(productCode,productName);
        ResponseData responseData = new ResponseData();
        responseData.setStatus(200);
        responseData.setMessage("查询成功！");
        responseData.setData(pList);
        return responseData;
    }

    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    @ApiOperation(value = "查询产品列表")
    public Object selectList(){
        List<Product> proList=productService.selectProduct();
        ResponseData responseData = new ResponseData();
        responseData.setStatus(200);
        responseData.setMessage("查询成功");
        responseData.setData(proList);
        return responseData;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(value = "添加产品")
    public Object insertPro(Product product){
        int i=productService.insertPro(product);
        ResponseData responseData = new ResponseData();
        if(i>0){
            responseData.setStatus(200);
            responseData.setMessage("添加成功");
        }else{
            responseData.setStatus(400);
            responseData.setMessage("添加失败");
        }
        return responseData;
    }
    @RequestMapping(value = "/modify",method = RequestMethod.PUT)
    @ApiOperation(value = "修改产品")
    public Object modifyPro(Product product){
        int i=productService.modifyPro(product);
        ResponseData responseData = new ResponseData();
        if(i>0){
            responseData.setStatus(200);
            responseData.setMessage("修改成功");
        }else{
            responseData.setStatus(400);
            responseData.setMessage("修改失败");
        }
        return responseData;
    }
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除产品")
    public Object deleteById(int id){
        int i=productService.deleteById(id);
        ResponseData responseData = new ResponseData();
        if(i>0){
            responseData.setStatus(200);
            responseData.setMessage("删除成功");
        }else{
            responseData.setStatus(400);
            responseData.setMessage("删除失败");
        }
        return responseData;
    }

}
