package org.cnsrdb.service;

import org.cnsrdb.po.Book;
import org.cnsrdb.vo.Vo;

/**
 * Created by rammel on 2018/1/6.
 */
public interface BookService {

    public Vo getAll();

    public Vo get(String name, String author);

    public Vo getByName(String name);

    public Vo getByAuthor(String author);

    public Vo addBook(Book book);

    public Vo delete(int id);
}
