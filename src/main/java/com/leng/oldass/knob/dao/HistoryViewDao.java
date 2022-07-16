package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.knob.dto.HistoryView;
import org.apache.ibatis.annotations.Mapper;

/**
 * (HistoryView)表数据库访问层
 *
 * @author lengzq
 * @since 2022-05-07 00:42:19
 */
@Mapper
public interface HistoryViewDao extends BaseMapper<HistoryView> {

}

