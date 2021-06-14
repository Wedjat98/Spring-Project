package com.lionlemon.factory;

import com.lionlemon.dao.UserDao;
import com.lionlemon.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
