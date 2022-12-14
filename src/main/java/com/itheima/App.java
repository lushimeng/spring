package com.itheima;

import com.itheima.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Mr.Lu
 * @Date 2022/10/27 15:13
 * @ClassName App
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookServiceImpl bookService = (BookServiceImpl) act.getBean("bookService");
        bookService.save();
    }
}
