package com.oldthank.bookcity.controller;

import com.oldthank.bookcity.entity.DbBookinfo;
import com.oldthank.bookcity.service.DbBookinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *
 * @author makejava
 * @since 2021-12-31 14:07:21
 */
@Api(tags = "圖書信息控制器")
@RestController
@RequestMapping("dbBookinfo")
public class DbBookinfoController {
    /**
     * 服务对象
     */
    @Resource
    private DbBookinfoService dbBookinfoService;

    /**
     * 通过主键查询单条数据
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public DbBookinfo selectOne(Integer id) {
        return this.dbBookinfoService.queryById(id);
    }

    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "bookname",value = "書名",required = true,dataType = "String"),
            @ApiImplicitParam(name = "commoditycode",value = "商品编码",required = true,dataType = "String"),
            @ApiImplicitParam(name = "isbn",value = "ISBN編碼",required = true,dataType = "String"),
            @ApiImplicitParam(name = "number",value = "頁數",required = true,dataType = "int"),
            @ApiImplicitParam(name = "press",value = "出版社",required = true,dataType = "String"),
            @ApiImplicitParam(name = "price",value = "價格",required = true,dataType = "double"),
            @ApiImplicitParam(name = "quantity",value = "數量",required = true,dataType = "int"),
    })
    @PostMapping("addBookInfo/{dbBookinfo}")
    public DbBookinfo addBook(DbBookinfo dbBookinfo){
        dbBookinfoService.insert(dbBookinfo);
        return null;
    }
}