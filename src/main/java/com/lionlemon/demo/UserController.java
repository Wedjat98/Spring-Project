package com.lionlemon.demo;


import com.lionlemon.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class UserController {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过绝对路径获取
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\Users\\ame98\\IdeaProjects\\helloSpring\\src\\main\\resources\\applicationContext.xml");
//        UserService userService = (UserService) applicationContext.getBean("userService");
        //字节码文件获取 只限于一个实现类的单个对象 多个对象时会报错
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();
    }
}
