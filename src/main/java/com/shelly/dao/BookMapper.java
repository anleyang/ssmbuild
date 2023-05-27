package com.shelly.dao;

import com.shelly.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: BookMapper
 * Package: com.shelly.dao
 * Description
 *
 * @Author Shelly
 * @Create 2023/5/26 16:03
 * @Version 1.0
 */
public interface BookMapper {

    //增一本书
    int addBook(Books books);

    //删一本书
    int deleteBookById(int id);

    //更一本书
    int updateBook(Books books);

    //查一本书
    Books queryBookById(int id);

    //查全部的书
    List<Books> queryAllBook();

}
