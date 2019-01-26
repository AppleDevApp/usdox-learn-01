package com.ucucs.usdoxlearneurekahystrix.service;

import com.ucucs.usdoxlearneurekahystrix.protocol.HelloServiceProtocol;
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
