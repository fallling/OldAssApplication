package com.leng.oldass.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.login.dao.UserRoleDao;
import com.leng.oldass.login.entity.UserRole;
import com.leng.oldass.login.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户角色(UserRole)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:37:19
 */
@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {

}

