package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.ArticleDao;
import com.leng.oldass.knob.dto.ArticleVo;
import com.leng.oldass.knob.entity.Article;
import com.leng.oldass.knob.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章(Article)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:40:58
 */
@Service("articleService")
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

    @Autowired
    ArticleDao articleDao;

    @Override
    public Page<ArticleVo> articleList(Page<ArticleVo> page, QueryWrapper<ArticleVo> wrapper) {
        return articleDao.articleList(page,wrapper);
    }
}

