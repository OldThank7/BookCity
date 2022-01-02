package com.oldthank.bookcity.dao;

import com.oldthank.bookcity.entity.DbBookinfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (DbBookinfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-31 14:07:21
 */
@Mapper
public interface DbBookinfoDao {

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
     * @return 影响行数
     */
    @Insert("insert into db_bookinfo (BookName, Price, ISBN, CommodityCode, Number, DrawingReviewNo, Press,Quantity) VALUES" +
                                   " (#{bookname},#{price},#{isbn},#{commoditycode},#{number},#{drawingreviewno},#{press},#{quantity})")
    int insert(DbBookinfo dbBookinfo);

    /**
     * 修改数据
     *
     * @param dbBookinfo 实例对象
     * @return 影响行数
     */
    int update(DbBookinfo dbBookinfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}