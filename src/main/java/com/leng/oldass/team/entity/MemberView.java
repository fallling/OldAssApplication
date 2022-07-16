package com.leng.oldass.team.entity;

import java.io.Serial;
import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (MemberView)表实体类
 *
 * @author lengzq
 * @since 2022-05-13 00:35:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberView extends Model<MemberView> {
    
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
     * 用户昵称
     */
    private String nickName;
    /**
     * 主键id
     */
    private String teamId;
    /**
     * 团队名称
     */
    private String teamName;
    /**
     * 角色id
     */
    private String roleId;
    /**
     * 角色名
     */
    private String roleName;

}

