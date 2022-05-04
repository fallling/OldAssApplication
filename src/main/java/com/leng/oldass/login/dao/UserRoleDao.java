package com.leng.oldass.login.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.login.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户角色(UserRole)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:37:19
 */
@Mapper
public interface UserRoleDao extends BaseMapper<UserRole> {

}

