package com.org.serviceexport.api;

import com.org.serviceexport.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by wangpeijian on 2018/6/22.
 */

@RequestMapping("hello")
@RestController
public class Hello {

    @Autowired
    private HelloService helloService;

    @RequestMapping("user")
    public String index(){
        return helloService.hello("wpj");
    }

}
