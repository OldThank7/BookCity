package com.oldthank.bookcity.service;

import com.oldthank.bookcity.entity.DbUser;
import java.util.List;

/**
 * (DbUser)表服务接口
 *
 * @author makejava
 * @since 2021-12-31 13:54:31
 */
public interface DbUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DbUser queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DbUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dbUser 实例对象
     * @return 实例对象
     */
    DbUser insert(DbUser dbUser);

    /**
     * 修改数据
     *
     * @param dbUser 实例对象
     * @return 实例对象
     */
    DbUser update(DbUser dbUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    int addUser(DbUser dbUser);
}