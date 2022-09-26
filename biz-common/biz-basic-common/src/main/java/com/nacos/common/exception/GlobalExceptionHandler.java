package com.nacos.common.exception;


import com.nacos.common.bean.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author fengbaojin
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 如果抛出的的是ServiceException，则调用该方法
     *
     * @param se 业务异常
     * @return Result
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public ResponseResult handle(BusinessException se) {
        log.error(se.getMessage());
        return ResponseResult.error(se.getCode(), se.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseResult handleException(Exception ex) {
        log.error(ex.getMessage());
        return ResponseResult.error(ex.getMessage(), "服务器开小差了");
    }

}
