package com.futurex.services.futurexeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FuturexEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuturexEurekaServerApplication.class, args);
    }

}
