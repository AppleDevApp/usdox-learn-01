package com.ucucs.usdoxlearnconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UsdoxLearnConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsdoxLearnConfigServerApplication.class, args);
    }

}

