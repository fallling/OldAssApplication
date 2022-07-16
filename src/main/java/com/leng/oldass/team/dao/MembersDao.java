package com.leng.oldass.team.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.team.entity.Members;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成员(Members)表数据库访问层
 *
 * @author lengzq
 * @since 2022-05-06 18:01:34
 */
@Mapper
public interface MembersDao extends BaseMapper<Members> {

}

