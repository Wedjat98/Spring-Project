package com.lionlemon.service.impl;

import com.lionlemon.dao.UserDao;
import com.lionlemon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//<bean id="userService" class="com.lionlemon.service.impl.UserServiceImpl"> </bean>
@Service("userService" )
public class UserServiceImpl implements UserService {
    // 注入 userDao <property name="userDao" ref="userDao"/>
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
