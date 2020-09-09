package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.pojo.Carrier;

import java.util.List;

@Mapper
public interface CarrierMapper {
    List<Carrier> getCarrierList();


    List<Carrier> queryByCodeAndName(@Param("carrierCode") String carrierCode,@Param("carrierName") String carrierName);

    int insertCarrier(Carrier carrier);

    int modifyCarrier(Carrier carrier);

    int deleteById(int id);
}
