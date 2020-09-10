package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.pojo.Product;
import org.example.pojo.Sale;
import org.example.pojo.SaleList;
import org.example.pojo.TurnSale;
import org.example.service.SaleListService;
import org.example.service.SaleService;
import org.example.service.TurnSaleService;
import org.example.util.CreationCode;
import org.example.vo.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "销售管理",description = "销售管理")
public class SaleController {

    @Autowired
    SaleService saleService;

    @Autowired
    SaleListService saleListService;

    @Autowired
    TurnSaleService turnSaleService;

    CreationCode c=new CreationCode();

    @RequestMapping(value = "/getSaleList" ,method = RequestMethod.GET)
    @ApiOperation(value = "销售列表")
    public Object getSaleList(){
        List<Sale> saleList=saleService.getSaleList();
        ResponseData responseData=new ResponseData();
        responseData.setStatus(200);
        responseData.setMessage("查询成功！！");
        responseData.setData(saleList);
        return responseData;
    }

    @RequestMapping(value = "/insertSale",method = RequestMethod.POST)
    @ApiOperation(value = "添加销售订单")
    public Object addSale(@RequestBody Sale sale){
        ResponseData responseData =new ResponseData();
        sale.setSaleCode(c.Code());
        int i =saleService.insertSale(sale);
        if(i>0){
            List<Product> pList=sale.getProList();
            int id=saleService.selectOne();
            int y=0;
            for(int x=0;x<pList.size();x++){
                SaleList sList=new SaleList();
                sList.setProductId(pList.get(x).getProductId());
                sList.setSaleId(id);
                sList.setCount(pList.get(x).getCount());
                sList.setTotalPrice((pList.get(x).getCount()*pList.get(x).getUnitPrice()));
                y=saleListService.insertList(sList);
                if(y<0){
                    responseData.setStatus(400);
                    responseData.setMessage("添加错误！！");
                    break;
                }else {
                    responseData.setStatus(200);
                    responseData.setMessage("添加成功！！");
                }
            }
        }else {
            responseData.setStatus(300);
            responseData.setMessage("添加失败！！");
        }
        return responseData;
    }

    @RequestMapping(value = "/del",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除销售订单")
    public Object deleteByid(int id){
        ResponseData responseData =new ResponseData();
        int i=saleService.deleteByid(id);
        if(i>0){
            int x=saleListService.deleteBySaleId(id);
            if(x>0){
                responseData.setStatus(200);
                responseData.setMessage("删除成功！！");
            }else {
                responseData.setStatus(400);
                responseData.setMessage("删除出错！！");
            }
        }else {
            responseData.setStatus(300);
            responseData.setMessage("删除失败！！");
        }
        return responseData;
    }

    @RequestMapping(value = "/turn",method = RequestMethod.PUT)
    @ApiOperation(value = "退货")
    public  Object returnGoods(@RequestBody Sale sale){
        ResponseData responseData =new ResponseData();
        int i=saleService.returnGoods(sale.getId());
        if(i>0){
            TurnSale ts=new TurnSale();
            ts.setTurnCode(c.Code());
            ts.setProductId(sale.getProList().get(0).getProductId());
            ts.setCount(sale.getProList().get(0).getCount());
            ts.setTotalPrice(sale.getProList().get(0).getCount()*sale.getProList().get(0).getUnitPrice());
            int x = turnSaleService.insertTrun(ts);
            if(x>0){
                responseData.setStatus(200);
                responseData.setMessage("退货申请成功！！");
            }else {
                responseData.setStatus(400);
                responseData.setMessage("退货申请错误！！");
            }

        }else {
            responseData.setStatus(300);
            responseData.setMessage("退货申请失败！！");
        }

        return responseData;
    }

}
