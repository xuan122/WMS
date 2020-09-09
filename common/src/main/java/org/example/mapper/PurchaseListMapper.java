package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.PurchaseList;

@Mapper
public interface PurchaseListMapper {
    int insert(PurchaseList purchaseList);

    int deleteByPurchaseId(int id);
}
