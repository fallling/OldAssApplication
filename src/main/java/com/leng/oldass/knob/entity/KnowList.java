package com.leng.oldass.knob.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 知识清单(KnowList)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:31:01
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class KnowList extends Model<KnowList> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 清单ID
     */
    @TableId
    private String listId;
    /**
     * 创建用户ID
     */
    private String createUserId;
    /**
     * 清单封面
     */
    private String listCoverImg;
    /**
     * 清单介绍
     */
    private String listIntro;
    /**
     * 文章数量
     */
    private Integer articleNum;
    /**
     * 阅读数
     */
    private Integer readNum;
    /**
     * 关注者数量
     */
    private Integer followersNum;
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

