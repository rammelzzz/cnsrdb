package org.cnsrdb.service;

import org.cnsrdb.po.Dynamic;
import org.cnsrdb.vo.Vo;

/**
 * Created by rammel on 2018/1/6.
 */
public interface DynamicService {

    /**
     * 获取动态消息列表
     * @param type
     * @return
     */
    public Vo getList(String type);

    /**
     * 获取某个动态消息的具体内容
     * @param id
     * @return
     */
    public Vo get(int id);

    /**
     * 插入动态消息
     * @param dynamic
     * @return
     */
    public Vo insert(Dynamic dynamic);

}
