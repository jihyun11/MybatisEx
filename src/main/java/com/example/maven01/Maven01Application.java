package com.example.maven01;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Mapper
public class Maven01Application {

    public static void main(String[] args) {
        SpringApplication.run(Maven01Application.class, args);
    }

}
