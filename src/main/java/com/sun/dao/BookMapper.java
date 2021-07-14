package com.sun.dao;

import com.sun.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    // 增加一本书
    int addBook(Books books);

    // 删除一本书
    int deleteBookByID(@Param("bookid") int id);

    // 更新一本书
    int updateBook(Books books);

    // 查询一本书
    Books queryBookByID(@Param("bookid") int id);

    // 查询所有的书
    List<Books> queryAll();

}
