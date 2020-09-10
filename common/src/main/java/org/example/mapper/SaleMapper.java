package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Sale;

import java.util.List;

@Mapper
public interface SaleMapper {

     List<Sale> getSaleList();

     int insertSale(Sale sale);

     int selectOne();

     int deleteByid(int id);

     int returnGoods(int id);

}
