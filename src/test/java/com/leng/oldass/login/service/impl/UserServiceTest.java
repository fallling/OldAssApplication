package com.leng.oldass.login.service.impl;

import com.alibaba.fastjson.JSON;
import com.leng.oldass.login.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;

import java.util.UUID;

/**
 * @author lengzq
 * @since 2022/3/19 21:35
 */
@SpringBootTest
class UserServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserServiceImpl userService;

    @Test
    @Rollback(value = false)
    void add(){
        User user = new User();
        user.setUserId(String.valueOf(UUID.randomUUID()));
        user.setUserName("lengzq");
        user.setNickName("破风");
        user.setUserIntro("吾有壮志凌云，不悲人生短暂");
        user.setAvatar("头像");
        user.setEmail("1832385204@qq.com");
        user.setPhone("15674707652");
        user.setUserPass(new BCryptPasswordEncoder().encode("abc123"));
        userService.save(user);
    }

    @Test
    void loadUserByUsername() {
        logger.info(JSON.toJSONString(userService.loadUserByUsername("lengzq")));
    }

    @Test
    void isExistEmail(){
        logger.info(String.valueOf(userService.isExistEmail("1832385204@qq.com")));
    }
}