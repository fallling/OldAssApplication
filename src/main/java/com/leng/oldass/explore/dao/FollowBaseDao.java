package com.leng.oldass.explore.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.explore.entity.FollowBase;
import org.apache.ibatis.annotations.Mapper;

/**
 * 关注知识库(FollowBase)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:44:19
 */
@Mapper
public interface FollowBaseDao extends BaseMapper<FollowBase> {

}

