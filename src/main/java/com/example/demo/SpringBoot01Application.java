package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//项目启动类添加注解@MapperScan项目启动时候扫描mapper接口，否则会报错找不到mapper文件
@MapperScan("com.example.demo.mapper")
public class SpringBoot01Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot01Application.class, args);
    }

}
