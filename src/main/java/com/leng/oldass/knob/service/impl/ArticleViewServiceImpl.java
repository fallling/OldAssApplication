package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.ArticleViewDao;
import com.leng.oldass.knob.dto.ArticleView;
import com.leng.oldass.knob.dto.ArticleVo;
import com.leng.oldass.knob.service.ArticleViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (ArticleView)表服务实现类
 *
 * @author lengzq
 * @since 2022-05-07 00:42:04
 */
@Service("articleViewService")
public class ArticleViewServiceImpl extends ServiceImpl<ArticleViewDao, ArticleView> implements ArticleViewService {
    @Autowired
    ArticleViewDao articleViewDao;

    @Override
    public Page<ArticleView> fuzzyQuery(Page<ArticleView> page, String arg) {
        return articleViewDao.fuzzyQuery(page, arg,arg);
    }
}

