package org.cnsrdb.mapper;

import org.cnsrdb.po.Dynamic;
import org.cnsrdb.vo.DynamicVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rammel on 2018/1/6.
 */
@Repository
public interface DynamicMapper {

    /**
     * 根据类型获取动态消息的列表
     * @param type
     * @return
     */
    public List<DynamicVo> getList(String type);

    /**
     * 获取某个消息的具体内容
     * @param id
     * @return
     */
    public Dynamic get(int id);

    /**
     * 添加动态消息
     * @param dynamic
     */
    public void insert(Dynamic dynamic);
}
