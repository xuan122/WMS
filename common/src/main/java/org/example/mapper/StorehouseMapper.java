package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.pojo.Storehouse;

import java.util.List;

@Mapper
public interface StorehouseMapper {
    public List<Storehouse> showStorehouse(@Param("storeHouseCode")String storeHouseCode,
                                           @Param("storeHouseName")String storeHouseName,
                                           @Param("storeHouseDepartmentId")int storeHouseDepartmentId,
                                           @Param("storeHouseType")int storeHouseType,
                                           @Param("page")int page,
                                           @Param("pageSize")int pageSize

                                            );
    public Storehouse getStorehouseById(@Param("id")int id);

    public int addStorehouse(Storehouse storehouse);

    public int updateStorehouse(Storehouse storehouse);

    public int deleteStorehouse(@Param("id")int id);

    public Storehouse defaultStorehouse();

}
