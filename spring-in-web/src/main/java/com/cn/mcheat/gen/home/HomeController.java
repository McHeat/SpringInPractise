package com.cn.mcheat.gen.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/11/9.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
//        throw new CustomException();
    }

//    /**
//     * 通过@ExceptionHandler注解处理异常CustomException
//     * @return
//    *@tip 迁移到公共部分CustomControllerAdvice
//     */
//    @ExceptionHandler(value = CustomException.class)
//    public String exceptionHandler() {
//        return "error/error";
//    }
}
