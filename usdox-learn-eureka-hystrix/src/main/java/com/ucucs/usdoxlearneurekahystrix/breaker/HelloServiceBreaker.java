package com.ucucs.usdoxlearneurekahystrix.breaker;

import com.ucucs.usdoxlearneurekahystrix.protocol.HelloServiceProtocol;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceBreaker implements HelloServiceProtocol {

    @Override
    public String sayHi(String name) {
        return "Hello From Breaker";
    }

}
