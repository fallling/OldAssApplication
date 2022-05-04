package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.UserBaseDao;
import com.leng.oldass.knob.entity.UserBase;
import com.leng.oldass.knob.service.UserBaseService;
import org.springframework.stereotype.Service;

/**
 * 用户知识库(UserBase)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:42:01
 */
@Service("userBaseService")
public class UserBaseServiceImpl extends ServiceImpl<UserBaseDao, UserBase> implements UserBaseService {

}

