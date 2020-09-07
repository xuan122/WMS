package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.pojo.Equipmentmanager;

import java.util.List;

@Mapper
public interface EquipmentmanagerMapper {
    public List<Equipmentmanager> showEquipmentmanager(@Param("equipmentCode")String equipmentCode,
                                                       @Param("equipmentName")String equipmentName,
                                                       @Param("page")int page,
                                                       @Param("pageSize")int pageSize);
    public Equipmentmanager getEquipmentmanagerById(@Param("id")int id);

    public int addEquipmentmanager(Equipmentmanager equipmentmanager);

    public int updateEquipmentmanager(Equipmentmanager equipmentmanager);

    public int deleteEquipmentmanager(@Param("id")int id);

}
