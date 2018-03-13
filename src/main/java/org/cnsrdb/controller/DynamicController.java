package org.cnsrdb.controller;

import org.cnsrdb.constant.Constant;
import org.cnsrdb.constant.ResponseCode;
import org.cnsrdb.po.Dynamic;
import org.cnsrdb.service.DynamicService;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rammel on 2018/1/6.
 */
@Controller
public class DynamicController {

    @Autowired
    private DynamicService dynamicService;

    @RequestMapping(value = "/dynamicList", method = RequestMethod.GET)
    public String dynamicList() {
        return "dynamicList";
    }

    @ResponseBody
    @RequestMapping(value = "/dynamicList", method = RequestMethod.POST)
    public Vo dynamicList(@RequestParam("msg_type") String type) {
        if(Constant.isDynamicType(type))
            return dynamicService.getList(type);
        else return Vo.createByFail(ResponseCode.ERROR.getCode(), "选择的动态消息类型不正确！");
    }

    @ResponseBody
    @RequestMapping(value = "/dynamic", method = RequestMethod.POST)
    public Vo dynamic(@RequestParam("id") int id) {
        return dynamicService.get(id);
    }

    @RequestMapping(value = "/dynamic", method = RequestMethod.GET)
    public String dynamic() {
        return "dynamic";
    }

    @ResponseBody
    @RequestMapping(value = "/addDynamic", method = RequestMethod.POST)
    public Vo addDynamic(@RequestParam("d_type") String d_type,
                         @RequestParam("d_title") String d_title,
                         @RequestParam("d_content") String d_content) {
        Dynamic dynamic = new Dynamic();
        dynamic.setD_content(d_content);
        dynamic.setD_title(d_title);
        dynamic.setD_type(d_type);
        return dynamicService.insert(dynamic);
    }

    @RequestMapping(value = "/addDynamic.html", method = RequestMethod.GET)
    public String addDynamic() {
        return "addDynamic";
    }
}

