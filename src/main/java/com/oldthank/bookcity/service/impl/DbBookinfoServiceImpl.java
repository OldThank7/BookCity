package com.oldthank.bookcity.service.impl;

import com.oldthank.bookcity.entity.DbBookinfo;
import com.oldthank.bookcity.dao.DbBookinfoDao;
import com.oldthank.bookcity.service.DbBookinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DbBookinfo)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 14:07:21
 */
@Service("dbBookinfoService")
public class DbBookinfoServiceImpl implements DbBookinfoService {

    @Resource
    private DbBookinfoDao dbBookinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DbBookinfo queryById(Integer id) {
        return this.dbBookinfoDao.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param dbBookinfo 实例对象
     * @return 实例对象
     */
    @Override
    public DbBookinfo insert(DbBookinfo dbBookinfo) {
        this.dbBookinfoDao.insert(dbBookinfo);
        return dbBookinfo;
    }

    /**
     * 修改数据
     *
     * @param dbBookinfo 实例对象
     * @return 实例对象
     */
    @Override
    public DbBookinfo update(DbBookinfo dbBookinfo) {
        this.dbBookinfoDao.update(dbBookinfo);
        return this.queryById(dbBookinfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dbBookinfoDao.deleteById(id) > 0;
    }
}