package com.leng.oldass.explore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.explore.dao.RecommendListDao;
import com.leng.oldass.explore.entity.RecommendList;
import com.leng.oldass.explore.service.RecommendListService;
import org.springframework.stereotype.Service;

/**
 * 推荐清单(RecommendList)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:44:00
 */
@Service("recommendListService")
public class RecommendListServiceImpl extends ServiceImpl<RecommendListDao, RecommendList> implements RecommendListService {

}

