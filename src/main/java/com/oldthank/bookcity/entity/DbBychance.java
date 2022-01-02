package com.oldthank.bookcity.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.io.Serializable;

/**
 * (DbBychance)实体类
 *
 * @author makejava
 * @since 2021-12-31 14:18:23
 */
@Data
public class DbBychance implements Serializable {
    private static final long serialVersionUID = 491627659227987561L;
    
    private Integer id;
    
    private String username;
    
    private LocalDateTime deliverytime;
    
    private String bookname;
    
    private LocalDateTime warehousingtime;
}