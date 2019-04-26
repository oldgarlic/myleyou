package com.lll.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class gatewayApp {
        public static void main(String[] args) {
            SpringApplication.run(gatewayApp.class,args);
        }
}
