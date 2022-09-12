package com.nacos.order.exception;

import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误编码
     */
    private String code;

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }


}
