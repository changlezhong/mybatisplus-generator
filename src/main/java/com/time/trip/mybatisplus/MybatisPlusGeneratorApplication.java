package com.time.trip.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.time.trip.mybatisplus"})
@MapperScan(basePackages = {"com.time.trip.mybatisplus.infrastructure.mapper"})
public class MybatisPlusGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusGeneratorApplication.class, args);
    }

}
