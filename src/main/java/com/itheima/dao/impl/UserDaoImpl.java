package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

/**
 * @Author Mr.Lu
 * @Date 2022/10/27 10:00
 * @ClassName UserDaoImpl
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao save ...");
    }
}
