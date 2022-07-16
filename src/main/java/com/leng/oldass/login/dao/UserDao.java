package com.leng.oldass.login.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leng.oldass.knob.dto.ArticleVo;
import com.leng.oldass.login.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户(User)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:36:20
 */
@Mapper
public interface UserDao extends BaseMapper<User> {


    /**
     * 通过邮箱查询单条数据
     * @param email 邮箱
     * @return user
     */
    @Select("select * from user where email = #{email}")
    User selectByEmail(@Param("email") String email);

    /**
     * 通过用户名查找单条数据
     * @param username 用户名
     * @return user
     */
    @Select("select * from user where user_name = #{username}")
    User selectByUserName(@Param("username") String username);

    /**
     * 模糊查询
     * @param page
     * @param arg1
     * @param arg2
     * @return
     */
    @Select("select user_id,user_name,nick_name from user where user_name like concat(concat('%' #{arg1}), '%') || nick_name like concat(concat('%' #{arg2}), '%')")
    Page<User> fuzzyQuery(Page<User> page, @Param("arg1") String arg1, @Param("arg2") String arg2);
}

