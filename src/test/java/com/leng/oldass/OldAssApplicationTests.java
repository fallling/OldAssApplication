package com.leng.oldass;

import com.alibaba.fastjson.JSON;
import com.leng.oldass.dao.UserDao;
import com.leng.oldass.util.RespBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OldAssApplicationTests {

    @Test
    void contextLoads() {

        RespBean respBean = RespBean.error("2");
        System.out.println(JSON.toJSONString(respBean));
    }

}
