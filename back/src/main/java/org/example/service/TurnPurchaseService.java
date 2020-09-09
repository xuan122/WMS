package org.example.service;

import org.example.mapper.TurnPurchaseMapper;
import org.example.pojo.TurnPurchase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TurnPurchaseService {

    @Resource
    private TurnPurchaseMapper turnPurchaseMapper;

    public int insertTpurchase(TurnPurchase turnPurchase){
//
        return turnPurchaseMapper.insertTpurchase(turnPurchase);
    }

    public List<TurnPurchase> turnList(){

        return turnPurchaseMapper.turnList();
    }
}
