package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.knob.entity.BaseArticle;
import org.apache.ibatis.annotations.Mapper;

/**
 * 知识库文章(BaseArticle)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:41:23
 */
@Mapper
public interface BaseArticleDao extends BaseMapper<BaseArticle> {

}

