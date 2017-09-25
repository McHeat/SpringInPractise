package com.mcheat.spring.stream.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by Administrator on 2017/9/25.
 */
public interface ChannelConfig {

    String RECEIVE_CHANNEL = "receiveChannel";

    String SEND_CHANNEL = "sendChannel";

    @Input(RECEIVE_CHANNEL)
    SubscribableChannel receive();

    @Output(SEND_CHANNEL)
    MessageChannel send();

}
