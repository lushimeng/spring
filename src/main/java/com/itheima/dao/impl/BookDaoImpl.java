package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

/**
 * @Author Mr.Lu
 * @Date 2022/10/27 10:00
 * @ClassName BookDaoImpl
 * @Version 1.0
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
