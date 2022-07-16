package com.leng.oldass.knob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.knob.dao.HistoryDao;
import com.leng.oldass.knob.entity.History;
import com.leng.oldass.knob.service.HistoryService;
import org.springframework.stereotype.Service;

/**
 * 历史记录(History)表服务实现类
 *
 * @author lengzq
 * @since 2022-05-06 23:03:10
 */
@Service("historyService")
public class HistoryServiceImpl extends ServiceImpl<HistoryDao, History> implements HistoryService {

}

