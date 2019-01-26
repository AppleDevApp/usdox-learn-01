package com.ucucs.usdoxlearneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UsdoxLearnEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsdoxLearnEurekaServerApplication.class, args);
	}

}

