package com.leng.oldass.explore.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 关注用户(FollowUser)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:30:42
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FollowUser extends Model<FollowUser> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
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
     * 关注用户ID
     */
    private String followUserId;
}

