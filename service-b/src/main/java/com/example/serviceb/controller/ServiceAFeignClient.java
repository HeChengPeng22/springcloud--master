package com.example.serviceb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hcp
 * @date 2021-07-08 15:04
 */
@FeignClient("SERVICE-OBJECT-A")
public interface ServiceAFeignClient {
    @RequestMapping("/testA")
    public String TestAController();
}
