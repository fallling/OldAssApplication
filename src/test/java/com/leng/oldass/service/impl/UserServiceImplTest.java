package com.leng.oldass.service.impl;

import com.leng.oldass.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lengzq
 * @since 2021/11/25 16:38
 */
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @Test
    void queryById() {
        System.out.println(userService.queryById(1));
    }

    @Test
    void queryByPage() {
    }

    @Test
    void insert() {
    }

    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void loadUserByUsername() {
        System.out.println(userService.loadUserByUsername("lengzq"));
    }
}