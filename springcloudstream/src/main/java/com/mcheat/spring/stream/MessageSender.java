package com.mcheat.spring.stream;

import com.mcheat.spring.stream.channel.ChannelConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/25.
 */
@Component
public class MessageSender {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelConfig channelConfig;


    public void send() {
        channelConfig.send().send(MessageBuilder.withPayload("12312").build());
    }

}
