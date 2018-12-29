package com.example.demo;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Users;

@MappedTypes(Users.class)
@MapperScan(basePackages="com.example.demo.mapper")
@SpringBootApplication
public class SpringBootWithMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMybatisApplication.class, args);
	}

}

