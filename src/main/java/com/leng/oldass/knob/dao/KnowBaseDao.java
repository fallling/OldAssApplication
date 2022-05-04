package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.knob.entity.KnowBase;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 知识库(KnowBase)表数据库访问层
 *
 * @author lengzq
 * @since 2022-03-19 19:40:34
 */
@Mapper
public interface KnowBaseDao extends BaseMapper<KnowBase> {

}

