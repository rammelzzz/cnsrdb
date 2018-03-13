package org.cnsrdb.mapper;

import org.cnsrdb.po.Patent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rammel on 2018/1/7.
 */
@Repository
public interface PatentMapper {

    public List<Patent> getAll();

}
