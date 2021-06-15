package com.lionlemon.demo;


import com.lionlemon.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserController {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        //字节码文件获取 只限于一个实现类的单个对象 多个对象时会报错
        userService.save();

    }
}
