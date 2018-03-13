package org.cnsrdb.mapper;

import org.cnsrdb.po.Student;
import org.springframework.security.web.authentication.preauth.x509.SubjectDnX509PrincipalExtractor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rammel on 2018/1/7.
 */
@Repository
public interface StudentMapper {

    public List<Student> graduateStudents();

    public List<Student> nowStudents();
}
