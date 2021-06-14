package com.lionlemon.dao.impl;

import com.lionlemon.dao.UserDao;
import com.lionlemon.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {

    private List<String> stringList;
    private Map<String, User>userMap;
    private Properties properties;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

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
//        System.out.println(username+"---------"+age);
        System.out.println(stringList);
        System.out.println(properties);
        System.out.println(userMap);
        System.out.println("save method is running...............");
    }
}
