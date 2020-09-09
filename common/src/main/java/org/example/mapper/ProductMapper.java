package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.pojo.Product;

import java.util.List;

@Mapper
public interface ProductMapper {
       List<Product> selectProduct();


       List<Product> conditionQuery(@Param("productCode") String productCode,@Param("productName") String productName);

       int insertPro(Product product);

       int modifyPro(Product product);

       int deleteById(int id);
}
