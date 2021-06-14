package com.lionlemon.dao.impl;

import com.lionlemon.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl对像被创建............");
    }

    @Override
    public void save() {


        System.out.println("save method is running...............");
    }
}
