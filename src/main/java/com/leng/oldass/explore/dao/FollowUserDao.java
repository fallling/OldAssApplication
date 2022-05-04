package com.leng.oldass.explore.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.explore.entity.FollowUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 关注用户(FollowUser)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:44:39
 */
@Mapper
public interface FollowUserDao extends BaseMapper<FollowUser> {

}

