package org.example.service;

import org.apache.ibatis.annotations.Param;
import org.example.mapper.DeptMapper;
import org.example.mapper.UnitMapper;
import org.example.pojo.Dept;
import org.example.pojo.Unit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UnitService {
    @Resource
    private UnitMapper unitMapper;

    public List<Unit> showUnit(String unitCode, String unitName){
        return unitMapper.showUnit(unitCode,unitName);
    }

    public Unit getUnitById(int id){
        return unitMapper.getUnitById(id);
    }

    public int addUnit(String unitCode,String unitName){
        return unitMapper.addUnit(unitCode,unitName);
    }

    public int updateUnit(String unitCode,String unitName,int id){
        return unitMapper.updateUnit(unitCode,unitName,id);

    }

    public int deleteUnit(int id){
        return unitMapper.deleteUnit(id);
    }

}
