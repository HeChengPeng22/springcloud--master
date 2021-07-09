package com.example.servicea.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hcp
 * @date 2021-07-08 15:00
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;
    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("testA")
    public String test01(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "Hello,Spring Cloud for Test"+port;
    }

    @RequestMapping("/otherService")
    public String otherService(){
        return "我是其他服务";
    }
    String fallback(){
        return "服务器忙";
    }
}
