package com.leng.oldass.calendar.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户任务(UserTodoList)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:32:22
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserTodoList extends Model<UserTodoList> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
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
    /**
     * ID
     */
    @TableId
    private String id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 任务ID
     */
    private String todoListId;

}

