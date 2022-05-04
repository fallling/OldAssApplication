package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.UserListDao;
import com.leng.oldass.knob.entity.UserList;
import com.leng.oldass.knob.service.UserListService;
import org.springframework.stereotype.Service;

/**
 * 用户知识清单(UserList)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:42:59
 */
@Service("userListService")
public class UserListServiceImpl extends ServiceImpl<UserListDao, UserList> implements UserListService {

}

