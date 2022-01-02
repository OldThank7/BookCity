package com.oldthank.bookcity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
@MapperScan(basePackages = "com.oldthank.bookcity.dao")
public class BookCityApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookCityApplication.class, args);
    }

}
