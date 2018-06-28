package com.org.serviceexport.api;

import com.org.serviceexport.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Create by wangpeijian on 2018/6/22.
 */

@RefreshScope
@RequestMapping("hello")
@RestController
public class Hello {

    @Autowired
    private HelloService helloService;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${foo}")
    String foo;

    @RequestMapping("user")
    public String index(){
        return helloService.hello("wpj");
    }

    @RequestMapping("config")
    public String config(){
        return foo;
    }

    @RequestMapping("rest")
    public String rest(){
        return restTemplate.getForObject("http://service-user/user/hello?name={1}", String.class, "zhenkeng");
    }
}
