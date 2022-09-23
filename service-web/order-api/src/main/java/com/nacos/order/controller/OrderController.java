package com.nacos.order.controller;

import com.nacos.order.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 **/
@RestController
@RequestMapping(value = "/order")
@Api(description = "订单服务")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/service")
    public String service() {
        String order = orderService.excute();
        return order;
    }

}
