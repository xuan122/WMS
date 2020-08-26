package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Type;

import java.util.List;

@Mapper
public interface TypeMapper {
     List<Type> selectList();

     int insert(Type type);

     int deleteById(int id);

     int modifyById(Type type);
}
