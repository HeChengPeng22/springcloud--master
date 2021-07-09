package com.example.servicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hcp
 * @date 2021-07-08 15:00
 */
@RestController
public class TestController {
    @RequestMapping("testA")
    public String test01(){
        return "Hello,Spring Cloud for Test";
    }
}
