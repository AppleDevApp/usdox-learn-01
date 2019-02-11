package com.ucucs.usdoxlearnconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {

    @Value("${username:}")
    private String userName;

    @RequestMapping("/")
    public String home() {
        return "Config Client Home";
    }

    @RequestMapping("hi")
    public String sayHi() {
        return "hi " + userName;
    }

}
