package com.sun.controller;

import com.sun.pojo.Books;
import com.sun.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    // controller层调service层

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;


    // 查询全部的书籍，并且返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAll();

        model.addAttribute("list",books);

        return "allBook";
    }


    // 跳转到增加书籍页面
    @RequestMapping("/toAddPage")
    public String toAddPage() {
        return "addBook";
    }

    // 添加书籍
    @RequestMapping("/addBook")
    public String addBook(Books book) {
        System.out.println("addBook=>" + book);
        bookService.addBook(book);
        return "redirect:/book/allBook";  // 重定向到@RequestMapping("/allBook")这个请求

    }

}
