package com.org.serviceexport.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create by wangpeijian on 2018/6/22.
 */
@FeignClient(value = "service-user", fallback = HelloServiceFall.class)
public interface HelloService {

    @GetMapping("/user/hello")
    String hello(@RequestParam(value = "name") String name);

}
@Component
 class HelloServiceFall implements HelloService{

     @Override
     public String hello(String name) {
         return String.format("fall %s", name);
     }
 }
