package com.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.mall.core.mapper.dao"})
public class MallWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallWebApplication.class, args);
    }

}
