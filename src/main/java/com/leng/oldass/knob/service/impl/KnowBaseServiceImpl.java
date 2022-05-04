package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.KnowBaseDao;
import com.leng.oldass.knob.entity.KnowBase;
import com.leng.oldass.knob.service.KnowBaseService;
import org.springframework.stereotype.Service;

/**
 * 知识库(KnowBase)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:40:36
 */
@Service("knowBaseService")
public class KnowBaseServiceImpl extends ServiceImpl<KnowBaseDao, KnowBase> implements KnowBaseService {

}

