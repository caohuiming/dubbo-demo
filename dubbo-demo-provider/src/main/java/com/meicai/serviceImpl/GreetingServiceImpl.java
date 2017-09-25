package com.meicai.serviceImpl;

import com.meicai.service.GreetingService;

import java.util.Date;

/**
 * Created by Administrator on 2017-09-25.
 */
public class GreetingServiceImpl implements GreetingService {
    public String hello(String name) {
        System.out.println("Hello Service is calling : " + new Date());
        String greetMessage = "Hello, " + name;
        return greetMessage;
    }
}
