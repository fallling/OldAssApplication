package com.leng.oldass.service.impl;

import com.alibaba.fastjson.JSON;
import com.leng.oldass.controller.ValidateController;
import com.leng.oldass.dao.UserDao;
import com.leng.oldass.entity.User;
import com.leng.oldass.util.TokenUtil;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);

    @Test
    void queryById() {
        User user = userService.queryById(1);
        user.setPassword("$2a$10$pbP7FHzGSJ/YOafWhKYppu/2icSa968hg4Az.Pbu1cuS3jpqJmq7e");
        logger.info(JSON.toJSONString(user));
        String token = TokenUtil.createToken(user);
        logger.info("+++++++ token = " + token);
        String explainToken = String.valueOf(TokenUtil.verify(token));
        logger.info("+++++++ token = " + explainToken);
    }

    @Test
    void queryByPage() {
    }

    @Test
    void insert() {
        User user = new User();
        user.setUsername("ccsulzq");
        user.setEnabled(true);
        userService.insert(user);
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

    @Test
    void loadUserByEmail() {
        logger.info(String.valueOf(userService.isExistUser("syaing@outlook.com")));
    }
}