package org.cnsrdb.controller;

import org.cnsrdb.po.Student;
import org.cnsrdb.service.StudentService;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rammel on 2018/1/7.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ResponseBody
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Vo students(@RequestParam("type") int type) {
        return studentService.getStudents(type);
    }

}
