package com.itheima.service.impl;

import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.service.BookService;

/**
 * @Author Mr.Lu
 * @Date 2022/10/27 10:02
 * @ClassName BookServiceImpl
 * @Version 1.0
 */
public class BookServiceImpl implements BookService {
    private BookDaoImpl bookDao;
    private UserDaoImpl userDao;

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
