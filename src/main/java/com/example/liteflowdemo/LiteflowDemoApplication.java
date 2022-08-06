package com.example.liteflowdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.liteflowdemo.bussies"})
public class LiteflowDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiteflowDemoApplication.class, args);
    }

}
