package org.example.service;

import org.apache.ibatis.annotations.Param;
import org.example.mapper.EquipmentmanagerMapper;
import org.example.pojo.Equipmentmanager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EquipmentmanagerService {
    @Resource
    private EquipmentmanagerMapper equipmentmanagerMapper;

    public List<Equipmentmanager> showEquipmentmanager(String equipmentCode,String equipmentName,int page,int pageSize){
        return equipmentmanagerMapper.showEquipmentmanager(equipmentCode,equipmentName,page,pageSize);
    }
    public Equipmentmanager getEquipmentmanagerById(int id){
        return equipmentmanagerMapper.getEquipmentmanagerById(id);
    }

    public int addEquipmentmanager(Equipmentmanager equipmentmanager){
        return equipmentmanagerMapper.addEquipmentmanager(equipmentmanager);
    }

    public int updateEquipmentmanager(Equipmentmanager equipmentmanager){
       return equipmentmanagerMapper.updateEquipmentmanager(equipmentmanager);
    }

    public int deleteEquipmentmanager(int id){
        return equipmentmanagerMapper.deleteEquipmentmanager(id);
    }

}
