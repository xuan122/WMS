package org.example.service;

import org.example.mapper.CarrierMapper;
import org.example.pojo.Carrier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarrierService {

    @Resource
   private CarrierMapper carrierMapper;

    public List<Carrier> getCarrierList(){
            return carrierMapper.getCarrierList();
    }

    public int insertCarrier(Carrier carrier){
        return carrierMapper.insertCarrier(carrier);
    }

    public int modifyCarrier(Carrier carrier){

        return carrierMapper.modifyCarrier(carrier);
    }

    public int deleteById(int id){
        return carrierMapper.deleteById(id);
    }

}
