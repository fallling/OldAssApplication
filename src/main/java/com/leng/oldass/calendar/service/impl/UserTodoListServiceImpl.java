package com.leng.oldass.calendar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.calendar.dao.UserTodoListDao;
import com.leng.oldass.calendar.entity.UserTodoList;
import com.leng.oldass.calendar.service.UserTodoListService;
import org.springframework.stereotype.Service;

/**
 * 用户任务(UserTodoList)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:39:00
 */
@Service("userTodoListService")
public class UserTodoListServiceImpl extends ServiceImpl<UserTodoListDao, UserTodoList> implements UserTodoListService {

}

