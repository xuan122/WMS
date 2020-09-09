package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.TurnPurchase;

import java.util.List;

@Mapper
public interface TurnPurchaseMapper {

    List<TurnPurchase> turnList();

    int insertTpurchase(TurnPurchase turnPurchase);
}
