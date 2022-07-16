package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leng.oldass.login.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lengzq
 * @since 2022/3/20 23:56
 */
@SpringBootTest
class KnowBaseServiceImplTest {

    @Autowired
    KnowBaseServiceImpl knowBaseService;
    @Autowired
    UserServiceImpl userService;

    @Autowired
    ArticleServiceImpl articleService;
    @Test
    void deleteByIds(){
        List<String> idList = new ArrayList<>();
        idList.add("1505566659440943105");
        knowBaseService.removeByIds(idList);
    }

    @Test
    void page(){
        articleService.articleList(new Page<>(1,10), null);
    }

    @Test
    void text(){
        userService.fuzzyQuery(new Page<>(1,10), "悬");
    }
}