package com.lionlemon.web;

import com.lionlemon.config.SpringConfiguration;
import com.lionlemon.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        //注解后这里也要改
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();
    }

}
