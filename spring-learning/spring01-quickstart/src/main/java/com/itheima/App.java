package com.itheima;

import com.itheima.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Song Laixiong
 * @Create: 2024-10-23
 * @Description:
 */

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
