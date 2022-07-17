package com.leng.oldass;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author lengzq
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:config/kaptcha.xml"})
@MapperScan("com.leng.oldass.calendar.dao")
@MapperScan("com.leng.oldass.explore.dao")
@MapperScan("com.leng.oldass.knob.dao")
@MapperScan("com.leng.oldass.login.dao")
@MapperScan("com.leng.oldass.team.dao")
@MapperScan("com.leng.oldass.favorites.dao")
public class OldAssApplication {

    public static void main(String[] args) {
        SpringApplication.run(OldAssApplication.class, args);
    }

}
