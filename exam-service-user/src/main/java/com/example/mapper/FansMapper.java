package com.example.mapper;

import com.example.my.mapper.MyMapper;
import com.example.pojo.Fans;
import org.springframework.stereotype.Repository;

@Repository
public interface FansMapper extends MyMapper<Fans> {
}