package com.mcheat.spring.controller;

import com.mcheat.spring.stream.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/25.
 */
@RestController
@RequestMapping("/api/sp")
public class TestController {

    @Autowired
    private MessageSender sender;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String send() {
        sender.send();
        return "Been Send";
    }

}
