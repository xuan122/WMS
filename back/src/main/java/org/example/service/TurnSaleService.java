package org.example.service;

import org.example.mapper.TurnSaleMapper;
import org.example.pojo.TurnSale;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TurnSaleService {

    @Resource
    TurnSaleMapper turnSaleMapper;

    public int insertTrun(TurnSale turnSale){
        return turnSaleMapper.insertTrun(turnSale);
    }
}
