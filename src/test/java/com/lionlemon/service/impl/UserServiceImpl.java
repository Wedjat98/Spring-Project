package com.lionlemon.service.impl;

import com.lionlemon.dao.UserDao;
import com.lionlemon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//<bean id="userService" class="com.lionlemon.service.impl.UserServiceImpl"> </bean>
@Service("userService" )
//@Scope("prototype") 范围->多例
public class UserServiceImpl implements UserService {
    //导入外部配置文件的情况下，可以使用${键}来直接注入值
    @Value("${jdbc.driver}")
    private String driver;

    // 注入 userDao <property name="userDao" ref="userDao"/>
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }
//    @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法被执行了");
    }
//    @PreDestroy
    public void destroy(){
        System.out.println("Service对象的销毁被执行了");
    }
}
