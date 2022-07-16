package com.leng.oldass.login.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dto.ArticleVo;
import com.leng.oldass.login.dao.UserDao;
import com.leng.oldass.login.entity.User;
import com.leng.oldass.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 用户(User)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:36:22
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {


    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDao.selectByUserName(s);
    }

    public boolean isExistEmail(String email){
        return userDao.selectByEmail(email) != null;
    }

    public boolean isExistUserName(String username){
        return userDao.selectByUserName(username) != null;
    }

    @Override
    public Page<User> fuzzyQuery(Page<User> page, String arg) {
        return userDao.fuzzyQuery(page,arg,arg);
    }
}

