package com.pucmm.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerClass {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerClass.class, args);
    }
}
