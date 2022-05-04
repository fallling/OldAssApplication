package com.leng.oldass.explore.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.explore.entity.RecommendList;
import org.apache.ibatis.annotations.Mapper;

/**
 * 推荐清单(RecommendList)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:44:00
 */
@Mapper
public interface RecommendListDao extends BaseMapper<RecommendList> {

}

