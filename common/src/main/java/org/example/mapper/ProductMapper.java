package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Product;

import java.util.List;

@Mapper
public interface ProductMapper {
       List<Product> selectProduct();

       int insertPro(Product product);

       int modifyPro(Product product);

       int deleteById(int id);
}
