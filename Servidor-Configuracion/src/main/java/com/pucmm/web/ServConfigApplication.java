package com.pucmm.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServConfigApplication {
    public ServConfigApplication() {
    }
    public static void main(String[] args) {
        SpringApplication.run(ServConfigApplication.class, args);
    }
}