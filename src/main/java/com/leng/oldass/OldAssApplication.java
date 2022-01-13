package com.leng.oldass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author lengzq
 */
@SpringBootApplication
@MapperScan("com.leng.oldass.dao")
@ImportResource(locations = {"classpath:config/kaptcha.xml"})
public class OldAssApplication {

    public static void main(String[] args) {
        SpringApplication.run(OldAssApplication.class, args);
    }

}
