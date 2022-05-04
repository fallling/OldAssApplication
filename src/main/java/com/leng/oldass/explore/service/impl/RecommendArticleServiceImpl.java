package com.leng.oldass.explore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.explore.dao.RecommendArticleDao;
import com.leng.oldass.explore.entity.RecommendArticle;
import com.leng.oldass.explore.service.RecommendArticleService;
import org.springframework.stereotype.Service;

/**
 * 推荐文章(RecommendArticle)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:43:44
 */
@Service("recommendArticleService")
public class RecommendArticleServiceImpl extends ServiceImpl<RecommendArticleDao, RecommendArticle> implements RecommendArticleService {

}

