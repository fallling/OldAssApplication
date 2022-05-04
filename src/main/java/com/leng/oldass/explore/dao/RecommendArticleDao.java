package com.leng.oldass.explore.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.explore.entity.RecommendArticle;
import org.apache.ibatis.annotations.Mapper;

/**
 * 推荐文章(RecommendArticle)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:43:44
 */
@Mapper
public interface RecommendArticleDao extends BaseMapper<RecommendArticle> {

}

