package com.ucucs.usdoxlearneurekaother.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public String home() {
        return "Eureka Client Home";
    }

    @RequestMapping("hi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "test") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
