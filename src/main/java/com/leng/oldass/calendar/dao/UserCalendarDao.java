package com.leng.oldass.calendar.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.calendar.entity.UserCalendar;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户日程(UserCalendar)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:39:16
 */
@Mapper
public interface UserCalendarDao extends BaseMapper<UserCalendar> {

}

