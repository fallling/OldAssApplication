package com.leng.oldass.knob.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.leng.oldass.knob.dto.ArticleVo;
import com.leng.oldass.knob.entity.Article;

/**
 * 文章(Article)表服务接口
 *
 * @author lengzq
 * @since 2022-03-19 19:40:58
 */
public interface ArticleService extends IService<Article> {
    /**
     * 查询
     * @param page
     * @param wrapper
     * @return
     */
    Page<ArticleVo> articleList(Page<ArticleVo> page, QueryWrapper<ArticleVo> wrapper);
}

