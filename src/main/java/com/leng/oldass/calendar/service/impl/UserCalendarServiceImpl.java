package com.leng.oldass.calendar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.calendar.dao.UserCalendarDao;
import com.leng.oldass.calendar.entity.UserCalendar;
import com.leng.oldass.calendar.service.UserCalendarService;
import org.springframework.stereotype.Service;

/**
 * 用户日程(UserCalendar)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:39:16
 */
@Service("userCalendarService")
public class UserCalendarServiceImpl extends ServiceImpl<UserCalendarDao, UserCalendar> implements UserCalendarService {

}

