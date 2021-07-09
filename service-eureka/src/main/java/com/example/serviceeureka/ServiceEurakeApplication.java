package com.example.serviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启Erueka服务
@EnableEurekaServer
public class ServiceEurakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEurakeApplication.class, args);
    }

}
