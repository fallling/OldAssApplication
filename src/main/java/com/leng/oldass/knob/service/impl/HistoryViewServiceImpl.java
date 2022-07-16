package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.HistoryViewDao;
import com.leng.oldass.knob.dto.HistoryView;
import com.leng.oldass.knob.service.HistoryViewService;
import org.springframework.stereotype.Service;

/**
 * (HistoryView)表服务实现类
 *
 * @author lengzq
 * @since 2022-05-07 00:42:19
 */
@Service("historyViewService")
public class HistoryViewServiceImpl extends ServiceImpl<HistoryViewDao, HistoryView> implements HistoryViewService {

}

