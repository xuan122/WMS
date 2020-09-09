package org.example.service;

import org.apache.ibatis.annotations.Param;
import org.example.mapper.ReservoirareaMapper;
import org.example.pojo.Reservoirarea;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReservoirareaServic {
    @Resource
    private ReservoirareaMapper reservoirareaMapper;

    public List<Reservoirarea> showReservoirarea(String areaCode, String areaName,int storeHouseId,int page,int pageSize ){
        return reservoirareaMapper.showReservoirarea(areaCode,areaName,storeHouseId,page,pageSize);
    }
    public Reservoirarea getReservoirareaById(int id){
        return reservoirareaMapper.getReservoirareaById(id);
    }

    public int addReservoirarea(Reservoirarea reservoirarea){
        return reservoirareaMapper.addReservoirarea(reservoirarea);

    }

    public int updateReservoirarea(Reservoirarea reservoirarea){
        return reservoirareaMapper.updateReservoirarea(reservoirarea);
    }

    public int deleteReservoirarea( int id){
        return reservoirareaMapper.deleteReservoirarea(id);
    }

    public Reservoirarea defaultReservoirarea(int storeHouseId){
        return reservoirareaMapper.defaultReservoirarea(storeHouseId);
    }

}
