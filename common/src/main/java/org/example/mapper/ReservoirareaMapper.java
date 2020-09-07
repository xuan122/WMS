package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.pojo.Reservoirarea;

import javax.annotation.Resource;
import java.util.List;

@Mapper
public interface ReservoirareaMapper {
    public List<Reservoirarea> showReservoirarea(@Param("areaCode")String areaCode,@Param("areaName")String areaName,
                                                @Param("storeHouseId")int storeHouseId
                                                ,@Param("page")int page,@Param("pageSize")int pageSize );
    public Reservoirarea getReservoirareaById(@Param("id")int id);

    public int addReservoirarea(Reservoirarea reservoirarea);

    public int updateReservoirarea(Reservoirarea reservoirarea);

    public int deleteReservoirarea(@Param("id") int id);

    public Reservoirarea defaultReservoirarea(@Param("storeHouseId")int storeHouseId);
}
