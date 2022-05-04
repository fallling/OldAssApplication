package com.leng.oldass.login.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.login.entity.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色(Role)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:36:47
 */
@Mapper
public interface RoleDao extends BaseMapper<Role> {

}

