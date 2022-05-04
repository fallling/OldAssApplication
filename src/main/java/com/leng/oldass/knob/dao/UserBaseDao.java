package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.knob.entity.UserBase;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户知识库(UserBase)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:42:01
 */
@Mapper
public interface UserBaseDao extends BaseMapper<UserBase> {

}

