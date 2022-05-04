package com.leng.oldass;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class OldAssApplicationTests {

    @Test
    void contextLoads() {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }

}
