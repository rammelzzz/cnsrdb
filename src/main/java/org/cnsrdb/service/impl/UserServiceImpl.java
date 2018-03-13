package org.cnsrdb.service.impl;

import org.apache.log4j.Logger;
import org.cnsrdb.constant.ResponseCode;
import org.cnsrdb.mapper.UserMapper;
import org.cnsrdb.po.User;
import org.cnsrdb.service.UserService;
import org.cnsrdb.util.StringUtil;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by rammel on 2018/1/6.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    private Logger logger = Logger.getLogger(getClass());

    public Vo login(String username, String password, HttpSession session) {
        User user = userMapper.get(username);
        if(user == null) {
            return Vo.createByFail(ResponseCode.USER_NOT_FOUNT.getCode(), ResponseCode.USER_NOT_FOUNT.getMsg());
        } else {
            if(StringUtil.isEq(user.getU_password(), password)) {
                logger.info("验证成功");
                Vo vo = Vo.createBySuccess(user);
                session.setAttribute("userVo", vo);
                return vo;
            }
             else {
                 logger.info("密码错误");
                return Vo.createByFail(ResponseCode.PASSWORD_ERROR.getCode(), ResponseCode.PASSWORD_ERROR.getMsg());
            }
        }
    }


    public Vo get(String username) {
        User user = userMapper.get(username);
        if(user == null) {
            return Vo.createByFail(ResponseCode.USER_NOT_FOUNT.getCode(), ResponseCode.USER_NOT_FOUNT.getMsg());
        } else {
            return Vo.createBySuccess(user);
        }
    }

    public Vo changePsw(String username, String password) {
        logger.info("用户" + username + "修改密码！");
        try {
            userMapper.changePsw(username, password);
            logger.info("修改成功");
            return Vo.createBySuccess("修改成功！");
        } catch (Exception e) {
            return Vo.createByFail(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMsg());
        }
    }
}
