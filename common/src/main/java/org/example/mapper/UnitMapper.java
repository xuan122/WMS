package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.pojo.Unit;

import java.util.List;
@Mapper
public interface UnitMapper {
    public List<Unit> showUnit(@Param("unitCode")String unitCode,@Param("unitName")String unitName);

    public Unit getUnitById(@Param("unitId")int unitId);

    public int addUnit(@Param("unitCode")String unitCode,@Param("unitName")String unitName);

    public int updateUnit(@Param("unitCode")String unitCode,@Param("unitName")String unitName,@Param("unitId")int unitId);

    public int deleteUnit(@Param("unitId")int unitId);


}
