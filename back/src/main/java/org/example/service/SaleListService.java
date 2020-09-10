package org.example.service;

import org.example.mapper.SaleListMapper;
import org.example.pojo.SaleList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SaleListService {

    @Resource
    SaleListMapper saleListMapper;

    public int insertList(SaleList saleList){
        return saleListMapper.insertList(saleList);
    }

    public int deleteBySaleId(int id){
        return saleListMapper.deleteBySaleId(id);
    }
}
