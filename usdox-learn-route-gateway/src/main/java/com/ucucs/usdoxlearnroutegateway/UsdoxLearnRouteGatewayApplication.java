package com.ucucs.usdoxlearnroutegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsdoxLearnRouteGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsdoxLearnRouteGatewayApplication.class, args);
    }

}

