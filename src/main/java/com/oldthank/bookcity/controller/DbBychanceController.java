package com.oldthank.bookcity.controller;

import com.oldthank.bookcity.entity.DbBychance;
import com.oldthank.bookcity.service.DbBychanceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DbBychance)表控制层
 *
 * @author makejava
 * @since 2021-12-31 14:18:23
 */
@RestController
@RequestMapping("dbBychance")
public class DbBychanceController {
    /**
     * 服务对象
     */
    @Resource
    private DbBychanceService dbBychanceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DbBychance selectOne(Integer id) {
        return this.dbBychanceService.queryById(id);
    }

}