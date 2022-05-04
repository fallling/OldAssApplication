package com.leng.oldass.calendar.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.calendar.entity.UserTodoList;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户任务(UserTodoList)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:38:59
 */
@Mapper
public interface UserTodoListDao extends BaseMapper<UserTodoList> {

}

