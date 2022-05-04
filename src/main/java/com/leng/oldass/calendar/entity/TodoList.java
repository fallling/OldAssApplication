package com.leng.oldass.calendar.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 任务(TodoList)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:31:55
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TodoList extends Model<TodoList> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 任务ID
     */
    @TableId
    private String listId;
    /**
     * 任务标题
     */
    private String listTitle;
    /**
     * 提醒
     */
    private String alarm;
    /**
     * 截至时间
     */
    private Date deadline;
    /**
     * 重复
     */
    private String listRepeat;
    /**
     * 相关文件
     */
    private String files;
    /**
     * 说明
     */
    private String remark;
    /**
     * 任务状态
     */
    private String status;
    /**
     * 租户号
     */
    private String tenantId;
    /**
     * 乐观锁
     */
    private String revision;
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

