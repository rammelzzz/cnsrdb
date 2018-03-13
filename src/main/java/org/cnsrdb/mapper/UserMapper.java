package org.cnsrdb.mapper;

import org.cnsrdb.po.User;
import org.springframework.stereotype.Repository;

/**
 * Created by rammel on 2018/1/6.
 */
@Repository
public interface UserMapper {

    public User get(String username);

    public User login(String username, String password);

    public void changePsw(String username, String password);
}
