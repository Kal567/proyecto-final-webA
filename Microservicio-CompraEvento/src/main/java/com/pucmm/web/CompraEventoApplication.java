package com.pucmm.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CompraEventoApplication {
    public CompraEventoApplication() {
    }
    public static void main(String[] args) {
        SpringApplication.run(CompraEventoApplication.class, args);
    }
}
