package com.slq.service;

import com.slq.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author qingqing
 * @function:业务层和数据层方法一样，但是它不访问数据库，不需要@Parame
 * @create 2021-02-23-16:47
 */
public interface BookService {
    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();
}
