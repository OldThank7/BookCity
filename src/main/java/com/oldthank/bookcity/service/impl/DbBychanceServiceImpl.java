package com.oldthank.bookcity.service.impl;

import com.oldthank.bookcity.entity.DbBychance;
import com.oldthank.bookcity.dao.DbBychanceDao;
import com.oldthank.bookcity.service.DbBychanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DbBychance)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 14:18:23
 */
@Service("dbBychanceService")
public class DbBychanceServiceImpl implements DbBychanceService {

    @Resource
    private DbBychanceDao dbBychanceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DbBychance queryById(Integer id) {
        return this.dbBychanceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DbBychance> queryAllByLimit(int offset, int limit) {
        return this.dbBychanceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dbBychance 实例对象
     * @return 实例对象
     */
    @Override
    public DbBychance insert(DbBychance dbBychance) {
        this.dbBychanceDao.insert(dbBychance);
        return dbBychance;
    }

    /**
     * 修改数据
     *
     * @param dbBychance 实例对象
     * @return 实例对象
     */
    @Override
    public DbBychance update(DbBychance dbBychance) {
        this.dbBychanceDao.update(dbBychance);
        return this.queryById(dbBychance.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dbBychanceDao.deleteById(id) > 0;
    }
}