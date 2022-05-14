package com.example.springboot.mapper;


import com.example.springboot.pojo.Slight;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SlightMapper {
    List<Slight> querySlightList();
    int add(Slight slight);
}
