package org.cnsrdb.service.impl;

import org.apache.log4j.Logger;
import org.cnsrdb.constant.ResponseCode;
import org.cnsrdb.mapper.DynamicMapper;
import org.cnsrdb.po.Dynamic;
import org.cnsrdb.service.DynamicService;
import org.cnsrdb.vo.DynamicVo;
import org.cnsrdb.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rammel on 2018/1/7.
 */
@Service("dynamicService")
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    private DynamicMapper dynamicMapper;
    private Logger logger = Logger.getLogger(getClass());

    public Vo getList(String type) {
        try {
            List<DynamicVo> dynamicVos = dynamicMapper.getList(type);
            return Vo.createBySuccess(dynamicVos);
        }catch (Exception e) {
            logger.error("服务器错误");
            e.printStackTrace();
            return Vo.createByFail(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMsg());
        }
    }

    public Vo get(int id) {
        Dynamic dynamic = dynamicMapper.get(id);
        return Vo.createBySuccess(dynamic);
    }

    public Vo insert(Dynamic dynamic) {
        dynamicMapper.insert(dynamic);
        return Vo.createBySuccess("插入成功！");
    }
}
