package com.leng.oldass.calendar.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.calendar.entity.TodoList;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务(TodoList)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:38:19
 */
@Mapper
public interface TodoListDao extends BaseMapper<TodoList> {

}

