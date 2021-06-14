package com.lionlemon.factory;

import com.lionlemon.dao.UserDao;
import com.lionlemon.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
