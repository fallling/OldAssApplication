package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.KnowListDao;
import com.leng.oldass.knob.entity.KnowList;
import com.leng.oldass.knob.service.KnowListService;
import org.springframework.stereotype.Service;

/**
 * 知识清单(KnowList)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:42:24
 */
@Service("knowListService")
public class KnowListServiceImpl extends ServiceImpl<KnowListDao, KnowList> implements KnowListService {

}

