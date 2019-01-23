package com.ankki.cfcmms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ankki.cfcmms.dao")
public class DsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsmApplication.class, args);
	}

}

