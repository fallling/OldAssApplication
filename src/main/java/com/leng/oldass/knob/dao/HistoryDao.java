package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.knob.entity.History;
import org.apache.ibatis.annotations.Mapper;

/**
 * 历史记录(History)表数据库访问层
 *
 * @author lengzq
 * @since 2022-05-06 23:03:10
 */
@Mapper
public interface HistoryDao extends BaseMapper<History> {

}

