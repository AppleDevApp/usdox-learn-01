package com.ucucs.usdoxlearneurekaribbon.controller;

import com.ucucs.usdoxlearneurekaribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String home() {
        return "Eureka Ribbon Home";
    }

    @RequestMapping(value = "hi")
    public String hi(@RequestParam String name) {
        return helloService.sayHiService(name);
    }

}
