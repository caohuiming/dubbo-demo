package com.meicai.customer;

import com.meicai.service.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2017-09-25.
 */
public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        String greetMessage = greetingService.hello("Eric");
        System.out.println("Consumer ==> " + greetMessage);
        context.destroy();
    }
}
