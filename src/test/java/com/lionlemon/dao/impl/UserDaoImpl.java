package com.lionlemon.dao.impl;

import com.lionlemon.dao.UserDao;
import org.springframework.stereotype.Repository;


//<bean id="userDao" class="com.lionlemon.dao.impl.UserDaoImpl"/>
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save method is running...............");
    }
}
