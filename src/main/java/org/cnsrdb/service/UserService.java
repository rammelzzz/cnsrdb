package org.cnsrdb.service;

import org.cnsrdb.po.User;
import org.cnsrdb.vo.Vo;

import javax.servlet.http.HttpSession;

/**
 * Created by rammel on 2018/1/6.
 */
public interface UserService{


    public Vo login(String username, String password, HttpSession session);


    public Vo get(String username);

    public Vo changePsw(String username, String password);
}
