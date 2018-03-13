package org.cnsrdb.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by rammel on 2018/1/19.
 */
@Controller
public class CrsfController {


    private Logger logger = Logger.getLogger(getClass());

    @ResponseBody
    @RequestMapping(value = "/a", method = RequestMethod.POST)
    public boolean a(@RequestParam("name") String name, HttpSession session) {
        System.out.println("JSESSIONID:" + session.getId());
        return true;
    }


}
