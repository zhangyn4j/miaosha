package com.zhyn4j.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.zhyn4j.miaosha.dao")
@ComponentScan(basePackages = "com.zhyn4j")
public class MiaoshaApplication {



	public static void main(String[] args) {
		SpringApplication.run(MiaoshaApplication.class, args);
	}

}

