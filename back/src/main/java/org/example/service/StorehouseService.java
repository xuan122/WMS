package org.example.service;

import org.apache.ibatis.annotations.Param;
import org.example.mapper.DeptMapper;
import org.example.mapper.StorehouseMapper;
import org.example.pojo.Dept;
import org.example.pojo.Storehouse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StorehouseService {
    @Resource
    private StorehouseMapper storehouseMapper;

    public List<Storehouse> showStorehouse(String storeHouseCode, String storeHouseName,
                                           int storeHouseDepartmentId, int storeHouseType,
                                           int page, int pageSize){
        return storehouseMapper.showStorehouse(storeHouseCode,storeHouseName,storeHouseDepartmentId,storeHouseType,page,pageSize);
    }
    public Storehouse getStorehouseById(int id){
        return storehouseMapper.getStorehouseById(id);
    }

    public int addStorehouse(Storehouse storehouse){
       return storehouseMapper.addStorehouse(storehouse);
    }

    public int updateStorehouse(Storehouse storehouse){
        return storehouseMapper.updateStorehouse(storehouse);
    }

    public int deleteStorehouse(int id){
        return storehouseMapper.deleteStorehouse(id);
    }

    public Storehouse defaultStorehouse(){
        return storehouseMapper.defaultStorehouse();
    }



}
