package com.ucucs.usdoxlearneurekafeign.protocol;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "eureka-client")
public interface HelloServiceProtocol {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);

}
