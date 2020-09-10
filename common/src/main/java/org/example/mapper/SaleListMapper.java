package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.SaleList;

@Mapper
public interface SaleListMapper {
    int insertList(SaleList saleList);

    int deleteBySaleId(int id);
}
