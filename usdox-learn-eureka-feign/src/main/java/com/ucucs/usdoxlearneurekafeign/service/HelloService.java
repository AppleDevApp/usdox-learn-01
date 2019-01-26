package com.ucucs.usdoxlearneurekafeign.service;

import com.ucucs.usdoxlearneurekafeign.protocol.HelloServiceProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private HelloServiceProtocol helloServiceProtocol;

    public String sayHiService(String name) {
        return helloServiceProtocol.sayHi(name);
    }

}
