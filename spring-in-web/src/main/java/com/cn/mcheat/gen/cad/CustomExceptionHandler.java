package com.cn.mcheat.gen.cad;

import com.cn.mcheat.gen.exception.CustomException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 通过@ControllerAdvice注解将异常处理用于全局
 * @author wangjy
 */
@ControllerAdvice
public class CustomExceptionHandler {

    /**
     * 通过@ExceptionHandler注解处理异常CustomException
     * @return
     */
    @ExceptionHandler(value = CustomException.class)
    public String exceptionHandler() {
        return "error/error";
    }
}
