package com.leng.oldass.calendar.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 日程(Calendar)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:30:22
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Calendar extends Model<Calendar> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 日程ID
     */
    @TableId
    private String calendarId;
    /**
     * 日程标题
     */
    private String calendarTitle;
    /**
     * 地点
     */
    private String place;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 重复
     */
    private String calendarRepeat;
    /**
     * 是否重要
     */
    private String importent;
    /**
     * 说明
     */
    private String remark;
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

