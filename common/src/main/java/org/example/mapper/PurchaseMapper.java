package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Purchase;

import java.util.List;

@Mapper
public interface PurchaseMapper {
    List<Purchase> getPurchaseList();

    int selectOne();


    int insertPur(Purchase purchase);

    int modify(Purchase purchase);

    int turnPurchase(int id);

    int deleteById(int id);

}
