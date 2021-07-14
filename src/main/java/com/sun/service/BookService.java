package com.sun.service;

import com.sun.pojo.Books;

import java.util.List;

public interface BookService {
    // 增加一本书
    int addBook(Books books);

    // 删除一本书
    int deleteBookByID(int id);

    // 更新一本书
    int updateBook(Books books);

    // 查询一本书
    Books queryBookByID(int id);

    // 查询所有的书
    List<Books> queryAll();

}
