package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leng.oldass.knob.dto.ArticleView;
import com.leng.oldass.knob.dto.ArticleVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * (ArticleView)表数据库访问层
 *
 * @author lengzq
 * @since 2022-05-07 00:42:04
 */
@Mapper
public interface ArticleViewDao extends BaseMapper<ArticleView> {
    @Select("select * from article_view where article_title like concat(concat('%' #{arg1}), '%') || content like concat(concat('%' #{arg2}), '%')")
    Page<ArticleView> fuzzyQuery(Page<ArticleView> page, @Param("arg1") String arg1 , @Param("arg2") String arg2);
}

