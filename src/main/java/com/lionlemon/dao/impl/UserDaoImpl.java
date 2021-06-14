package com.lionlemon.dao.impl;

import com.lionlemon.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void save() {
        System.out.println(username+"---------"+age);
        System.out.println("save method is running...............");
    }
}
