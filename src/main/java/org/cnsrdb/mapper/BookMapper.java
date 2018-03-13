package org.cnsrdb.mapper;

import org.cnsrdb.po.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rammel on 2018/1/6.
 */
@Repository
public interface BookMapper {

    public List<Book> getAll();

    public List<Book> get(String b_name, String b_author);

    public List<Book> getByName(String b_name);

    public List<Book> getByAuthor(String author);

    public void addBook(Book book);

    public void delete(int id);
}
