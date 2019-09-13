package com.sdxb.springbootexample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sdxb.springbootexample.dao")
public class SpringbootexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootexampleApplication.class, args);
    }

}
