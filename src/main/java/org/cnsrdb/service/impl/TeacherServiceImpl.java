package org.cnsrdb.service.impl;

import org.cnsrdb.mapper.TeacherMapper;
import org.cnsrdb.po.Teacher;
import org.cnsrdb.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rammel on 2018/1/18.
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public List<Teacher> listTeachers(int type) {
        if(type == 0)
        return teacherMapper.listTeachers();
        else return null;
    }
}
