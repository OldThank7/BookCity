package com.oldthank.bookcity.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (DbUser)实体类
 *
 * @author makejava
 * @since 2021-12-31 13:54:29
 */
@Data
public class DbUser implements Serializable {

    private static final long serialVersionUID = -71256541419340289L;

    private Integer id;
    
    private String username;
    
    private String password;
    
    private String address;
    
    private String phone;
    
    private String email;
}