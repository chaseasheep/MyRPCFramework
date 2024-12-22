package com.chase.service.impl;

import com.chase.model.User;
import com.chase.service.UserService;

import java.util.Random;
import java.util.UUID;

/**
 * @program: IntelliJ IDEA
 * @description: User 实现类
 * @author: chaseacode
 * @create: 2024-12-22 23:09
 **/
public class UserServiceImpl implements UserService {


    public User getUserByUserId(Integer id) {
        System.out.println("客户端查询了"+id+"的用户");
        Random random = new Random();
        User user = User.builder().userName(UUID.randomUUID().toString())
                .id(id)
                .sex(random.nextBoolean()).build();
        return user;
    }
}
