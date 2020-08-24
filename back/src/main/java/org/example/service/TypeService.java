package org.example.service;

import org.example.mapper.TypeMapper;
import org.example.pojo.Type;
import org.springframework.beans.factory.annotation.Autowired;
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

}
