package com.chase.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: IntelliJ IDEA
 * @description: User对象 version1
 * @author: chaseacode
 * @create: 2024-12-22 12:46
 **/

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    // 客户端和服务端共有的
    private Integer id;
    private String userName;
    private Boolean sex;
}
