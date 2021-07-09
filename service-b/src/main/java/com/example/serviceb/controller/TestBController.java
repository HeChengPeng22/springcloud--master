package com.example.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hcp
 * @date 2021-07-08 15:09
 */
@RestController
@EnableEurekaClient
@EnableFeignClients
public class TestBController {
    @Autowired
    private ServiceAFeignClient serviceAFeignClient;
    @RequestMapping("call")
    public String test02(){
        String result = serviceAFeignClient.TestAController();
        return "b to a访问结果:"+result;
    }
}
