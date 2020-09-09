package org.example.service;

import org.example.mapper.PurchaseMapper;
import org.example.pojo.Purchase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PurchaseService {

    @Resource
    PurchaseMapper purchaseMapper;

    public List<Purchase> getPurchaseList(){

        return purchaseMapper.getPurchaseList();
    }

    public int selectOne(){

        return purchaseMapper.selectOne();
    }

   public int insertPur(Purchase purchase){

        return purchaseMapper.insertPur(purchase);
   }

   public int modify(Purchase purchase){
       return purchaseMapper.modify(purchase);
   }

   public int turnPurchase(int id){

        return purchaseMapper.turnPurchase(id);
   }

    public int deleteById(int id){
        return purchaseMapper.deleteById(id);
    }
}
