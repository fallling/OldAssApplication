package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.knob.entity.KnowList;
import org.apache.ibatis.annotations.Mapper;

/**
 * 知识清单(KnowList)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:42:24
 */
@Mapper
public interface KnowListDao extends BaseMapper<KnowList> {

}

