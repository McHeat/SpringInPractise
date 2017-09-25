package com.mcheat.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
//        useDefaultFilters = false,   // 会自动屏蔽Component等的自动检测
        excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Autowire.class),      // 排除注解
//        @ComponentScan.Filter(type =FilterType.ASSIGNABLE_TYPE, value = SpbLearnApplication.class),        // 排除指定类
//        @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "org..*Servier"),           // 排除指定切面
//        @ComponentScan.Filter(type = FilterType.REGEX, pattern = ""),               // 正则表达式
//        @ComponentScan.Filter(type = FilterType.CUSTOM)               // 自定义TypeFilter
})
public class SpbLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpbLearnApplication.class, args);
    }
}
