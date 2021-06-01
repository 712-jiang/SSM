package com.slq.service;

import com.slq.dao.BookMapper;
import com.slq.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-23-16:51
 */
//@Service
public class BookServiceImpl implements BookService {
    //service层调dao层
//    @Autowired
    private BookMapper bookMapper;

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
