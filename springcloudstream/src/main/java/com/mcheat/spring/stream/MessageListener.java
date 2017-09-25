package com.mcheat.spring.stream;

import com.mcheat.spring.stream.channel.ChannelConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/25.
 */
@Component
public class MessageListener {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @StreamListener(ChannelConfig.RECEIVE_CHANNEL)
    public void getMsg(@Payload String msg) {
        logger.info("I receive a message: {}", msg);
    }

}
