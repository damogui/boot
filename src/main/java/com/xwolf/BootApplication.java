package com.xwolf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

//@Configuration
@SpringBootApplication
@MapperScan("com.xwolf.boot.dao")
public class BootApplication {


//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(BootApplication.class);
//    }

    public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
