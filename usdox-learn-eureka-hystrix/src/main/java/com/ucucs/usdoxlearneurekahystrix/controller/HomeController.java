package com.ucucs.usdoxlearneurekahystrix.controller;

import com.ucucs.usdoxlearneurekahystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String home() {
        return "Eureka Ribbon Home";
    }

    @RequestMapping(value = "hi")
    public String hi(@RequestParam String name) {
        return helloService.sayHiService(name);
    }

}
