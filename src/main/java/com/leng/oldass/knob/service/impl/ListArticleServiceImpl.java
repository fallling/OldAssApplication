package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.ListArticleDao;
import com.leng.oldass.knob.entity.ListArticle;
import com.leng.oldass.knob.service.ListArticleService;
import org.springframework.stereotype.Service;

/**
 * 清单文章(ListArticle)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:42:42
 */
@Service("listArticleService")
public class ListArticleServiceImpl extends ServiceImpl<ListArticleDao, ListArticle> implements ListArticleService {

}

