package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.TurnSale;

@Mapper
public interface TurnSaleMapper {

    int insertTrun(TurnSale turnSale);
}
