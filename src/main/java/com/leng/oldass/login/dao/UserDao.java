package com.leng.oldass.login.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
}

