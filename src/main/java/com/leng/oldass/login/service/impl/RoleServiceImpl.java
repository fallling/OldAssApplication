package com.leng.oldass.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.login.dao.RoleDao;
import com.leng.oldass.login.entity.Role;
import com.leng.oldass.login.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * 角色(Role)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-20 02:50:06
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {

}

