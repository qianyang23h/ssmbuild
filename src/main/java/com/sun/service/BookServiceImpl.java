package com.sun.service;

import com.sun.dao.BookMapper;
import com.sun.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    // service层调Dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookByID(int id) {
        return bookMapper.deleteBookByID(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookByID(int id) {
        return bookMapper.queryBookByID(id);
    }

    @Override
    public List<Books> queryAll() {
        return bookMapper.queryAll();
    }
}
