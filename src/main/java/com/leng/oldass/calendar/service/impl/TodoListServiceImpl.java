package com.leng.oldass.calendar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.calendar.dao.TodoListDao;
import com.leng.oldass.calendar.entity.TodoList;
import com.leng.oldass.calendar.service.TodoListService;
import org.springframework.stereotype.Service;

/**
 * 任务(TodoList)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:38:21
 */
@Service("todoListService")
public class TodoListServiceImpl extends ServiceImpl<TodoListDao, TodoList> implements TodoListService {

}

