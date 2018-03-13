package org.cnsrdb.service.impl;

import org.cnsrdb.mapper.PatentMapper;
import org.cnsrdb.service.PatentService;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rammel on 2018/1/7.
 */
@Service("patentService")
public class PatentServiceImpl implements PatentService {

    @Autowired
    private PatentMapper patentMapper;

    public Vo getAll() {
        try {
            return Vo.createBySuccess(patentMapper.getAll());
        } catch (Exception e) {
            e.printStackTrace();
            return Vo.createByError("服务器内部错误！");
        }
    }
}
