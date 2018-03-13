package org.cnsrdb.service.impl;

import org.cnsrdb.mapper.BookMapper;
import org.cnsrdb.po.Book;
import org.cnsrdb.service.BookService;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rammel on 2018/1/6.
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public Vo getAll() {
        return Vo.createBySuccess(bookMapper.getAll());
    }

    public Vo get(String name, String author) {
        return Vo.createBySuccess(bookMapper.get(name, author));
    }

    public Vo getByName(String name) {
        return Vo.createBySuccess(bookMapper.getByName(name));
    }

    public Vo getByAuthor(String author) {
        return Vo.createBySuccess(bookMapper.getByAuthor(author));
    }

    public Vo addBook(Book book) {
        try {
            bookMapper.addBook(book);
            return Vo.createBySuccess("添加成功！");
        } catch (Exception e) {
            return Vo.createByError("服务器错误！");
        }
    }

    public Vo delete(int id) {
        return Vo.createBySuccess("删除成功");
    }
}
