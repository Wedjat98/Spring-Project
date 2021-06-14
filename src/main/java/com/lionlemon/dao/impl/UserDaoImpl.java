package com.lionlemon.dao.impl;

import com.lionlemon.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl对像被创建............");
    }


    public void init(){
        System.out.println("初始化方法。。。。。。。");
    }
    public void destroy(){
        System.out.println("销毁方法。。。。。。。");
    }
    @Override
    public void save() {


        System.out.println("save method is running...............");
    }
}
