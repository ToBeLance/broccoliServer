package com.kun.broccoli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//这里写的是告诉spring框架mapper接口在什么位置，然后找到对应的地方扫描。不写框架会找不到接口
@MapperScan("com.kun.broccoli.mapper")
public class BroccoliApplication {

    public static void main(String[] args) {
        SpringApplication.run(BroccoliApplication.class, args);
    }

}
