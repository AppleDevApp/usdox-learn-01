package com.ucucs.usdoxlearneurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsdoxLearnEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsdoxLearnEurekaClientApplication.class, args);
    }

}

