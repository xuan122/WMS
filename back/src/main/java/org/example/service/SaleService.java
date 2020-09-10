package org.example.service;

import org.example.mapper.SaleMapper;
import org.example.pojo.Sale;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SaleService {

    @Resource
    SaleMapper saleMapper;

    public List<Sale> getSaleList(){
        return saleMapper.getSaleList();
    }

    public int insertSale(Sale sale){
        return saleMapper.insertSale(sale);
    }

    public int selectOne(){
        return saleMapper.selectOne();
    }

    public int deleteByid(int id){
        return saleMapper.deleteByid(id);
    }

    public int returnGoods(int id){
        return saleMapper.returnGoods(id);
    }
}
