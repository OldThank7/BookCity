package com.oldthank.bookcity.controller;

import com.oldthank.bookcity.entity.DbUser;
import com.oldthank.bookcity.service.DbUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DbUser)表控制层
 *
 * @author makejava
 * @since 2021-12-31 13:54:32
 */
@Api(tags = "用戶管理控制器")
@RestController
@RequestMapping("dbUser")
public class DbUserController {

    /**
     * 服务对象
     */
    @Resource
    private DbUserService dbUserService;

    /**
     * 通过主键查询单条数据
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ApiOperation("查詢一個用戶信息")
    public DbUser selectOne(Integer id) {
        return this.dbUserService.queryById(id);
    }

    /**
     * 添加一個用戶信息
     * @Author OldThank
     * @Description //TODO
     * @Date 2021/12/31-15:57
     * @param dbUser: 用戶信息
     * @return java.lang.Integer
     */
    @ApiOperation("添加一個用戶信息")
    @PostMapping("/adduser/{dbUser}")
    public Integer addUser(DbUser dbUser){
        return dbUserService.addUser(dbUser);
    }
}