package org.example.service;

import org.example.mapper.PurchaseListMapper;
import org.example.pojo.PurchaseList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PurchaseListService {

    @Resource
    private PurchaseListMapper purchaseListMapper;
//
    public int insert(PurchaseList purchaseList){
        return purchaseListMapper.insert(purchaseList);
    }

    public int deleteByPurchaseId(int id){

        return purchaseListMapper.deleteByPurchaseId(id);
    }
}
