package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.knob.entity.UserList;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户知识清单(UserList)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:42:59
 */
@Mapper
public interface UserListDao extends BaseMapper<UserList> {

}

