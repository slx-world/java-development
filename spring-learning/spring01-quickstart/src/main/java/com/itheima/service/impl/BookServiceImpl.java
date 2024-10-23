package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;

/**
 * @Author: Song Laixiong
 * @Create: 2024-10-23
 * @Description:
 */

public class BookServiceImpl implements BookService {

    //private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
