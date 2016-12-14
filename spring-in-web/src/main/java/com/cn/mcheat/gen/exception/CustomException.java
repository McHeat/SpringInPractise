package com.cn.mcheat.gen.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 自定义异常处理
 * @author wangjy
 * @description
 *          通过@ResponseStatus注解，spring自动处理异常
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason = "自定义异常抛错")
public class CustomException extends RuntimeException {

}
