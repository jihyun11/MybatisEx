package com.example.maven01.mapper;

import com.example.maven01.domain.Test;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface TestMapper {
    public int selectTest();
}
