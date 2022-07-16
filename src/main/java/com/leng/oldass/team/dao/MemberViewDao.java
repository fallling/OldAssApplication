package com.leng.oldass.team.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.team.entity.MemberView;
import org.apache.ibatis.annotations.Mapper;

/**
 * (MemberView)表数据库访问层
 *
 * @author lengzq
 * @since 2022-05-13 00:35:33
 */
@Mapper
public interface MemberViewDao extends BaseMapper<MemberView> {

}

