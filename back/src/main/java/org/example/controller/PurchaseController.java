package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.pojo.Purchase;
import org.example.pojo.PurchaseList;
import org.example.pojo.TurnPurchase;
import org.example.service.PurchaseListService;
import org.example.service.PurchaseService;
import org.example.service.TurnPurchaseService;
import org.example.util.CreationCode;
import org.example.vo.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "采购管理",description = "采购管理类")
public class PurchaseController {
//
    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private PurchaseListService purchaseListService;

    @Autowired
    private TurnPurchaseService turnPurchaseService;

    CreationCode creatCode=new CreationCode();

    @RequestMapping(value = "/getPur",method = RequestMethod.GET)
    @ApiOperation(value = "采购列表")
    public Object getPurchase(){
        List<Purchase> purList=purchaseService.getPurchaseList();
        ResponseData responseData = new ResponseData();
        responseData.setStatus(200);
        responseData.setMessage("查询成功！");
        responseData.setData(purList);

        return responseData;
    }
    @RequestMapping(value = "/isnertPur",method = RequestMethod.POST)
    @ApiOperation(value = "添加采购")
    public Object inserPur(@RequestBody Purchase purchase){
        int i=purchaseService.insertPur(purchase);
        ResponseData responseData = new ResponseData();
        if(i>0){
            int id=purchaseService.selectOne();
               for(int j=0;j<purchase.getProduct().size();j++){
                   PurchaseList purchaseList=new PurchaseList();
                   purchaseList.setPurchaseId(id);
                   purchaseList.setProductId(purchase.getProduct().get(j).getProductId());
                   purchaseList.setCount(purchase.getProduct().get(j).getCount());
                   purchaseList.setTotalPrice((purchase.getProduct().get(j).getCount()*purchase.getProduct().get(j).getUnitPrice()));
                   int x=purchaseListService.insert(purchaseList);
                   if(x>0){
                       responseData.setStatus(200);
                       responseData.setMessage("添加成功！");
                   }
               }
        }else {
            responseData.setStatus(300);
            responseData.setMessage("添加失败！");
        }
        return responseData;
    }

    @RequestMapping(value = "/modifyPur",method = RequestMethod.PUT)
    @ApiOperation(value = "修改采购")
    public Object modify(@RequestBody Purchase purchase){
        int i=purchaseService.modify(purchase);
        ResponseData responseData = new ResponseData();
        if(i>0){
            responseData.setStatus(200);
            responseData.setMessage("修改成功！");
        }else {
            responseData.setStatus(300);
            responseData.setMessage("修改失败！");
        }

        return responseData;
    }

    @RequestMapping(value = "/turnPur",method = RequestMethod.PUT)
    @ApiOperation(value = "退货")
    public Object turnPurchase(@RequestBody Purchase purchase){

        TurnPurchase turnPurchase=new TurnPurchase();
        turnPurchase.setTurnCode(creatCode.Code());
        turnPurchase.setPurchaseId(purchase.getId());
        turnPurchase.setCount(purchase.getProduct().get(0).getCount());
        turnPurchase.setTotalPrice(purchase.getProduct().get(0).getCount()*purchase.getProduct().get(0).getUnitPrice());
        int x=turnPurchaseService.insertTpurchase(turnPurchase);
        ResponseData responseData = new ResponseData();
        if(x>0){
            int i=purchaseService.turnPurchase(purchase.getId());
            if(i>0){
                responseData.setStatus(200);
                responseData.setMessage("退货成功！");
            }

        }else {
            responseData.setStatus(300);
            responseData.setMessage("退货失败！");
        }

        return responseData;
    }

    @RequestMapping(value = "/getturn",method = RequestMethod.GET)
    @ApiOperation(value = "采购退货列表")
    public Object turnList(){
        List<TurnPurchase>  tlist=turnPurchaseService.turnList();
        ResponseData responseData =new ResponseData();
        responseData.setStatus(200);
        responseData.setMessage("查询成功！");
        responseData.setData(tlist);

        return responseData;

    }

    @RequestMapping(value = "/delPur",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除采购")
    public Object delete(int id){
        int i=purchaseService.deleteById(id);
        ResponseData responseData = new ResponseData();
        if(i>0){
            int x=purchaseListService.deleteByPurchaseId(id);
           if(x>0){
               responseData.setStatus(200);
               responseData.setMessage("删除成功！");
           }
        }else {
            responseData.setStatus(300);
            responseData.setMessage("删除失败！");
        }

        return responseData;
    }

}
