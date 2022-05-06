package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.KnowViewDao;
import com.leng.oldass.knob.dto.KnowBaseVo;
import com.leng.oldass.knob.service.KnowViewService;
import org.springframework.stereotype.Service;

/**
 * (KnowBaseVo)表服务实现类
 *
 * @author lengzq
 * @since 2022-05-06 16:24:04
 */
@Service("knowViewService")
public class KnowViewServiceImpl extends ServiceImpl<KnowViewDao, KnowBaseVo> implements KnowViewService {

}

