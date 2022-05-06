package com.leng.oldass.knob.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leng.oldass.knob.dto.KnowBaseVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * (KnowBaseVo)表数据库访问层
 *
 * @author lengzq
 * @since 2022-05-06 16:24:00
 */
@Mapper
public interface KnowViewDao extends BaseMapper<KnowBaseVo> {

}

