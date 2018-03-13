package org.cnsrdb.controller;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.cnsrdb.constant.ResponseCode;
import org.cnsrdb.po.User;
import org.cnsrdb.service.UserService;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by rammel on 2018/1/6.
 */
@Controller
public class UserController {


    @Autowired
    private UserService userService;
    private Logger logger = Logger.getLogger(getClass());

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Vo login(@RequestParam("U_ID") String u_id, @RequestParam("U_Password") String u_password, HttpSession session) {
        logger.info("开始登录验证！");
         try {
             return userService.login(u_id, u_password, session);
         } catch (Exception e) {
             e.printStackTrace();
             return Vo.createByFail(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMsg());
         }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/session", method = RequestMethod.POST)
    public Vo check(HttpSession session) {
        return (Vo) session.getAttribute("userVo");
    }


    @RequestMapping(value = "/changePassword.html", method = RequestMethod.GET)
    public String changePassword() {
        return "changePassword";
    }

    @ResponseBody
    @RequestMapping(value = "/changePassword", method = RequestMethod.POST)
    public Vo changePassword(@RequestParam("old_password") String old_password,
                             @RequestParam("new_password") String new_password,
                             HttpSession session) {
        Vo userVo = (Vo)session.getAttribute("userVo");
        User user = (User)userVo.getData();
        if(!old_password.equals(user.getU_password())) {
            return Vo.createByFail(ResponseCode.ERROR.getCode(), "旧密码输入错误！");
        } else {
            return userService.changePsw(user.getU_name(), new_password);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public Vo logout(HttpSession session) {
        session.removeAttribute("userVo");
        return null;
    }

}