package org.cnsrdb.service.impl;

import org.cnsrdb.mapper.StudentMapper;
import org.cnsrdb.service.StudentService;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rammel on 2018/1/7.
 */
@Service("studentService")
public class StundentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public Vo getStudents(int type) {
        if(type == 0) {
            return Vo.createBySuccess(studentMapper.nowStudents());
        } else {
            return Vo.createBySuccess(studentMapper.graduateStudents());
        }
    }
}
