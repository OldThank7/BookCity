package com.oldthank.bookcity.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (DbBookinfo)实体类
 *
 * @author makejava
 * @since 2021-12-31 14:07:21
 */
@Data
public class DbBookinfo implements Serializable {
    private static final long serialVersionUID = 722765483349003374L;
    
    private Integer id;
    
    private String bookname;
    
    private double price;
    
    private String isbn;
    
    private String commoditycode;
    
    private Integer number;
    
    private String drawingreviewno;
    
    private String press;

    private int quantity;

}