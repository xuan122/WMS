package org.example.service;

import org.example.mapper.ProductMapper;
import org.example.pojo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductService {

    @Resource
    ProductMapper productMapper;

   public List<Product> selectProduct(){
        return productMapper.selectProduct();
    }

    public int insertPro(Product product){
       return productMapper.insertPro(product);
    }
    public int modifyPro(Product product){
       return productMapper.modifyPro(product);
    }
    public int deleteById(int id){
       return productMapper.deleteById(id);
    }
}
