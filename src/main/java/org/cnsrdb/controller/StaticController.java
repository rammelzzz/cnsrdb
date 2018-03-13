package org.cnsrdb.controller;

import org.cnsrdb.constant.StaticPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by rammel on 2018/1/6.
 */
@Controller
@RequestMapping(method = RequestMethod.GET)
public class StaticController implements StaticPage {

    @RequestMapping(value = "/index")
    public String index() {
        return INDEX;
    }

    @RequestMapping(value = "/header")
    public String header() {
        return HEADER;
    }

    @RequestMapping(value = "/footer")
    public String footer() {
        return FOOTER;
    }

    @RequestMapping(value = "/menu")
    public String menu() {
        return MENU;
    }

    @RequestMapping(value = "/introduction")
    public String introduction() {
        return "introduction";
    }

    @RequestMapping(value = "/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping(value = "/patent")
    public String patent() {
        return "patent";
    }

    @RequestMapping(value = "/student")
    public String student() {
        return "student";
    }

    @RequestMapping(value = "/teacher")
    public String teacher() {
        return "teacher";
    }

    @RequestMapping(value = "/deleteBook")
    public String deleteBook() {
        return "deleteBook";
    }

    @RequestMapping(value = "/test")
    public String test(HttpSession session) {
        System.out.println("JSESSIONID:" + session.getId());
        return "test";
    }

    @RequestMapping(value = "csrf")
    public String csrf() {
        return "csrf";
    }

}
