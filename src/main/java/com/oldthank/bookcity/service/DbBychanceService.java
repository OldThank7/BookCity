package com.oldthank.bookcity.service;

import com.oldthank.bookcity.entity.DbBychance;
import java.util.List;

/**
 * (DbBychance)表服务接口
 *
 * @author makejava
 * @since 2021-12-31 14:18:23
 */
public interface DbBychanceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DbBychance queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DbBychance> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dbBychance 实例对象
     * @return 实例对象
     */
    DbBychance insert(DbBychance dbBychance);

    /**
     * 修改数据
     *
     * @param dbBychance 实例对象
     * @return 实例对象
     */
    DbBychance update(DbBychance dbBychance);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}