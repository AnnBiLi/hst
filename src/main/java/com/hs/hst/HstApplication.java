package com.hs.hst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@MapperScan("com.hs.hst.mapper")
@SpringBootApplication()
public class HstApplication {

    public static void main(String[] args) {
        SpringApplication.run(HstApplication.class, args);
    }

}
