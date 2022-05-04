package com.leng.oldass.calendar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.calendar.dao.CalendarDao;
import com.leng.oldass.calendar.entity.Calendar;
import com.leng.oldass.calendar.service.CalendarService;
import org.springframework.stereotype.Service;

/**
 * 日程(Calendar)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-20 01:23:06
 */
@Service("calendarService")
public class CalendarServiceImpl extends ServiceImpl<CalendarDao, Calendar> implements CalendarService {

}

