package org.cnsrdb.mapper;

import org.cnsrdb.po.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rammel on 2018/1/18.
 */
@Repository
public interface TeacherMapper {


    public List<Teacher> listTeachers();

}
