package com.oldthank.bookcity.service.impl;

import com.oldthank.bookcity.entity.DbUser;
import com.oldthank.bookcity.dao.DbUserDao;
import com.oldthank.bookcity.service.DbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DbUser)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 13:54:31
 */
@Service("dbUserService")
public class DbUserServiceImpl implements DbUserService {
    @Resource
    private DbUserDao dbUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DbUser queryById(Integer id) {
        return this.dbUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DbUser> queryAllByLimit(int offset, int limit) {
        return this.dbUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dbUser 实例对象
     * @return 实例对象
     */
    @Override
    public DbUser insert(DbUser dbUser) {
        this.dbUserDao.insert(dbUser);
        return dbUser;
    }

    /**
     * 修改数据
     *
     * @param dbUser 实例对象
     * @return 实例对象
     */
    @Override
    public DbUser update(DbUser dbUser) {
        this.dbUserDao.update(dbUser);
        return this.queryById(dbUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dbUserDao.deleteById(id) > 0;
    }

    /**
     * 添加一個用戶
     * @Author OldThank
     * @Description //TODO
     * @Date 2021/12/31-15:45
     * @param dbUser: 用戶信息
     * @return void
     */
    @Override
    public int addUser(DbUser dbUser) {
        return dbUserDao.addUser(dbUser);
    }
}