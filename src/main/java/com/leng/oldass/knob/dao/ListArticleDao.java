package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.knob.entity.ListArticle;
import org.apache.ibatis.annotations.Mapper;

/**
 * 清单文章(ListArticle)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:42:42
 */
@Mapper
public interface ListArticleDao extends BaseMapper<ListArticle> {

}

