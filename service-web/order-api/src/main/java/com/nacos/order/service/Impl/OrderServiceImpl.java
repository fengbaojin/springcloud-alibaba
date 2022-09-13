package com.nacos.order.service.Impl;

import com.nacos.common.bean.Constants;
import com.nacos.common.exception.BusinessException;
import com.nacos.order.entity.Order;
import com.nacos.order.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public String excute() {
        Order order = new Order();
        Optional.ofNullable(order).ifPresent(p -> checkValue(p));
        System.out.println(order);
        Optional.ofNullable(order).filter(p -> !Objects.equals("哈哈哈",p.getMsg())).orElseThrow(() -> new BusinessException(Constants.CODE_ERROR, "请检查用户密码是否正确"));
        return null;
    }

    private void checkValue(Order order) {
        order.setMsg("哈哈哈");
    }
}
