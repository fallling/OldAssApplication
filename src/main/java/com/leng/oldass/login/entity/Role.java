package com.leng.oldass.login.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色(Role)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:31:20
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Role extends Model<Role> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 角色ID
     */
    @TableId
    private String roleId;
    /**
     * 角色名
     */
    private String roleName;
    /**
     * 角色介绍
     */
    private String roleIntro;
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

