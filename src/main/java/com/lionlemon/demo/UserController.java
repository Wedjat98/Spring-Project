package com.lionlemon.demo;


import com.lionlemon.service.UserService;
import com.lionlemon.service.impl.UserServiceImpl;


public class UserController {
    public static void main(String[] args) {
        /*
         * ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         * UserService userService = (UserService) applicationContext.getBean("userService");
         * userService.save();
         */
        //空指针异常 因为自己New出来的对象没有值。
        UserService userService = new UserServiceImpl();
        userService.save();
    }
}
