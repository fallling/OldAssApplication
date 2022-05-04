package com.leng.oldass.knob.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 知识库(KnowBase)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:30:52
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class KnowBase extends Model<KnowBase> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 知识库ID
     */
    @TableId
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
     * 租户号
     */
    private String tenantId;
    /**
     * 乐观锁
     */
    private Integer revision;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    private Date updatedTime;

}

