package org.example.service;

import org.example.mapper.TypeMapper;
import org.example.pojo.Type;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeService {

    @Resource
    private TypeMapper typeMapper;

    public List<Type> selectList(){
        return typeMapper.selectList();
    }

    public List<Type> selectByCodeAndName(String statusName,String statusCode){
        return typeMapper.selectByCodeAndName(statusName,statusCode);
    }

    public int insert(Type type){
        return typeMapper.insert(type);
    }

    public int deleteById(int id){
        return typeMapper.deleteById(id);
    }

    public int modifyById(Type type){
        return typeMapper.modifyById(type);
    }

}
