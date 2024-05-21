package com.bizzjen.cipesserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CipesServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CipesServiceRegistryApplication.class, args);
    }

}
