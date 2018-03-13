package org.cnsrdb.controller;

import org.apache.log4j.Logger;
import org.cnsrdb.constant.Constant;
import org.cnsrdb.constant.ResponseCode;
import org.cnsrdb.po.Book;
import org.cnsrdb.service.BookService;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rammel on 2018/1/6.
 */
@Controller
public class BookController {


    @Autowired
    private BookService bookService;
    private Logger logger = Logger.getLogger(getClass());

    @ResponseBody
    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public Vo bookList(@RequestParam(value = "b_name", required = false) String b_name,
                       @RequestParam(value = "b_author", required = false) String b_author) {
       try {
           if(!b_name.equals(Constant.EMPTY) && !b_author.equals(Constant.EMPTY)) {
               return bookService.get(b_name, b_author);
           }  else if(b_name.equals(Constant.EMPTY) && b_author.equals(Constant.EMPTY)) {
               return bookService.getAll();
           } else {
               if(b_author.equals(Constant.EMPTY)) {
                   return bookService.getByName(b_name);
               } else{
                    return bookService.getByAuthor(b_author);
               }
           }
       } catch (Exception e) {
           return Vo.createByFail(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMsg());
       }
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String book() {
        return "book";
    }


    @ResponseBody
    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public Vo addBook(@RequestParam("book_no") String book_no,
                      @RequestParam("book_author") String book_author,
                      @RequestParam("book_name") String book_name,
                      @RequestParam("book_publish_year") String book_publish_year) {
        Book book = new Book();
        book.setB_author(book_author);
        book.setB_name(book_name);
        book.setB_id(book_no);
        book.setB_publicYear(book_publish_year);
        book.setB_in("1");
        logger.info(book.toString());
        return bookService.addBook(book);
    }

    @RequestMapping(value = "/addBook.html")
    public String add() {
        return "addBook";
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestParam("b_id") int id) {

    }

}
