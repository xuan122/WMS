package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Carrier;

import java.util.List;

@Mapper
public interface CarrierMapper {
    List<Carrier> getCarrierList();

    int insertCarrier(Carrier carrier);

    int modifyCarrier(Carrier carrier);

    int deleteById(int id);
}
