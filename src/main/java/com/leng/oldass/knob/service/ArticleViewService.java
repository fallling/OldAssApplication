package com.leng.oldass.knob.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.leng.oldass.knob.dto.ArticleView;
import com.leng.oldass.knob.dto.ArticleVo;

/**
 * (ArticleView)表服务接口
 *
 * @author lengzq
 * @since 2022-05-07 00:42:04
 */
public interface ArticleViewService extends IService<ArticleView> {
    /**
     * 模糊查询
     * @param page
     * @param arg
     * @return
     */
    Page<ArticleView> fuzzyQuery(Page<ArticleView> page, String arg);
}

