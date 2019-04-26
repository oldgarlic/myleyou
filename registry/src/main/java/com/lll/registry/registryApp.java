package com.lll.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class registryApp {
       public static void main(String[] args) {
           SpringApplication.run(registryApp.class,args);
       } 
    
}
