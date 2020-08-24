package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Dept;

import java.util.List;

@Mapper
public interface DeptMapper {
    public List<Dept> showDept();
}
