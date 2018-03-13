package org.cnsrdb.controller;

import org.cnsrdb.service.PatentService;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rammel on 2018/1/7.
 */
@Controller
public class PatentController {

    @Autowired
    private PatentService patentService;

    @ResponseBody
    @RequestMapping(value = "/patent", method = RequestMethod.POST)
    public Vo patent() {
        return patentService.getAll();
    }


}
