package com.oldthank.bookcity.dao;

import com.oldthank.bookcity.entity.DbBychance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (DbBychance)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-31 14:18:23
 */
@Mapper
public interface DbBychanceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DbBychance queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DbBychance> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dbBychance 实例对象
     * @return 对象列表
     */
    List<DbBychance> queryAll(DbBychance dbBychance);

    /**
     * 新增数据
     *
     * @param dbBychance 实例对象
     * @return 影响行数
     */
    int insert(DbBychance dbBychance);

    /**
     * 修改数据
     *
     * @param dbBychance 实例对象
     * @return 影响行数
     */
    int update(DbBychance dbBychance);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}