package org.timmtiy.ordering.system.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.timmtiy.ordering.system"})
@MapperScan("org.timmtiy.ordering.system.dao")
public class OrderingSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderingSystemApplication.class);
    }
}
