package com.mcheat.spring;

import com.mcheat.spring.stream.channel.ChannelConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;

/**
 * Created by Administrator on 2017/9/14.
 */
@SpringBootApplication
@EnableBinding(ChannelConfig.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
