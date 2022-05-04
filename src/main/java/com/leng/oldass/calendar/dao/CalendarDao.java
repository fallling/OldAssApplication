package com.leng.oldass.calendar.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.calendar.entity.Calendar;
import org.apache.ibatis.annotations.Mapper;

/**
 * 日程(Calendar)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-20 01:23:06
 */
public interface CalendarDao extends BaseMapper<Calendar> {

}

