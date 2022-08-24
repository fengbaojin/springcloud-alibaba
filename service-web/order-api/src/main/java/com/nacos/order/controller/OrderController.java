package com.nacos.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 **/
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @GetMapping("/service")
    public String service(){
        System.out.printf("测试一下");
        return "测试成功";
    }
}
