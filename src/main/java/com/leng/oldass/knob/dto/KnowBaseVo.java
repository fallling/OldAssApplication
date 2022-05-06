package com.leng.oldass.knob.dto;

import java.util.Date;
import java.io.Serial;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (KnowBaseVo)表实体类
 *
 * @author lengzq
 * @since 2022-05-06 16:24:03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "know_view")
public class KnowBaseVo extends Model<KnowBaseVo> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 知识库id
     */
    private String baseId;
    /**
     * 知识库名称
     */
    private String baseName;
    /**
     * 知识库介绍
     */
    private String baseIntro;
    /**
     * 创建时间
     */
    private Date createTime;

}

