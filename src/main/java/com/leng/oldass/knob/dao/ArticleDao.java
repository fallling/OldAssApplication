package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leng.oldass.knob.dto.ArticleVo;
import com.leng.oldass.knob.entity.Article;
import com.leng.oldass.knob.service.ArticleService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 文章(Article)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:40:58
 */
@Mapper
public interface ArticleDao extends BaseMapper<Article> {

    /**
     * Article Dto查询
     * @param page
     * @param wrapper
     * @return
     */
    @Select("select a.article_id, article_title, nick_name as createuser, base_name,last_edit_time\n" +
            "from article a, know_base b , base_article ba, user u, user_base ub\n" +
            "where a.article_id = ba.article_id and\n" +
            "      ba.base_id = b.base_id and\n" +
            "      u.user_id = ub.user_id")
    Page<ArticleVo> articleList(Page<ArticleVo> page, @Param(Constants.WRAPPER) QueryWrapper<ArticleVo> wrapper);
}

