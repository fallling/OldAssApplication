package com.leng.oldass.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leng.oldass.login.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 用户(User)表服务接口
 *
 * @author lengzq
 * @since 2022-03-19 19:36:21
 */
public interface UserService extends IService<User>, UserDetailsService {
}

