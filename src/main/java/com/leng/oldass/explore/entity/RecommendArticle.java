package com.leng.oldass.explore.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 推荐文章(RecommendArticle)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:31:11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RecommendArticle extends Model<RecommendArticle> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * ID
     */
    @TableId
    private String id;
    /**
     * 文章ID
     */
    private String articleId;
    /**
     * 概要
     */
    private String synopsis;
    /**
     * 封面
     */
    private String coverImg;
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

