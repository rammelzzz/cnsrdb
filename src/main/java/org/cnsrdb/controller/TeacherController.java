package org.cnsrdb.controller;

import org.cnsrdb.service.TeacherService;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rammel on 2018/1/18.
 */
@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ResponseBody
    @RequestMapping(value = "/teacher", method = RequestMethod.POST)
    public Vo teachers(@RequestParam("type") int type) {
        return Vo.createBySuccess(teacherService.listTeachers(type));
    }

}
