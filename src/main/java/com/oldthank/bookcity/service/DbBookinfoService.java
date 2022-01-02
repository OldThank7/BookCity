package com.oldthank.bookcity.service;

import com.oldthank.bookcity.entity.DbBookinfo;
import java.util.List;

/**
 * (DbBookinfo)表服务接口
 *
 * @author makejava
 * @since 2021-12-31 14:07:21
 */
public interface DbBookinfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DbBookinfo queryById(Integer id);

    /**
     * 新增数据
     *
     * @param dbBookinfo 实例对象
     * @return 实例对象
     */
    DbBookinfo insert(DbBookinfo dbBookinfo);

    /**
     * 修改数据
     *
     * @param dbBookinfo 实例对象
     * @return 实例对象
     */
    DbBookinfo update(DbBookinfo dbBookinfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}