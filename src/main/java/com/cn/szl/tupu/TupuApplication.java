package com.cn.szl.tupu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.cn.szl.tupu.dao")
@EnableTransactionManagement
public class TupuApplication {

	public static void main(String[] args) {
		SpringApplication.run(TupuApplication.class, args);
	}
}
