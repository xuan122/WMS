package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.pojo.Type;

import java.util.List;

@Mapper
public interface TypeMapper {
     List<Type> selectList();

     List<Type> selectByCodeAndName(@Param("statusName") String statusName,@Param("statusCode") String statusCode);

     int insert(Type type);

     int deleteById(int id);

     int modifyById(Type type);
}
