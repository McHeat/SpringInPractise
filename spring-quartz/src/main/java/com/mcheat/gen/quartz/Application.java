package com.mcheat.gen.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 *
 * @author wangjy
 * @date 2017/6/14.
 */
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.mcheat.gen.quartz"
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
