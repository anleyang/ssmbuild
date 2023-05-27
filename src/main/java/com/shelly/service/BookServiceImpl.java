package com.shelly.service;

import com.shelly.dao.BookMapper;
import com.shelly.pojo.Books;
import java.util.List;

/**
 * ClassName: BookServiceImpl
 * Package: com.shelly.service
 * Description
 *
 * @Author Shelly
 * @Create 2023/5/26 17:00
 * @Version 1.0
 */

public class BookServiceImpl implements BookService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

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