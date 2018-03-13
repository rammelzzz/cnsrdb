package org.cnsrdb.service;

import org.cnsrdb.po.Teacher;

import java.util.List;

/**
 * Created by rammel on 2018/1/18.
 */
public interface TeacherService {

    public List<Teacher> listTeachers(int type);

}
