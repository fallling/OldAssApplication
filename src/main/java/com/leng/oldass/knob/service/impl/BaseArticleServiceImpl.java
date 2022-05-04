package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.BaseArticleDao;
import com.leng.oldass.knob.entity.BaseArticle;
import com.leng.oldass.knob.service.BaseArticleService;
import org.springframework.stereotype.Service;

/**
 * 知识库文章(BaseArticle)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:41:23
 */
@Service("baseArticleService")
public class BaseArticleServiceImpl extends ServiceImpl<BaseArticleDao, BaseArticle> implements BaseArticleService {

}

