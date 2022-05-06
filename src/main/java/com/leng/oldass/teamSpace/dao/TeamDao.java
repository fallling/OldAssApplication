package com.leng.oldass.teamSpace.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.teamSpace.entity.Team;
import org.apache.ibatis.annotations.Mapper;

/**
 * 团队(Team)表数据库访问层
 *
 * @author lengzq
 * @since 2022-05-06 18:00:50
 */
@Mapper
public interface TeamDao extends BaseMapper<Team> {

}

