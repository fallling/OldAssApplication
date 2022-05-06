package com.leng.oldass.teamSpace.entity;

import java.io.Serial;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 成员(Members)表实体类
 *
 * @author lengzq
 * @since 2022-05-06 18:01:34
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Members extends Model<Members> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 主键id
     */
    private String id;
    /**
     * 团队id
     */
    private String teamId;
    /**
     * 成员id
     */
    private String userId;
    /**
     * 角色id
     */
    private String roleId;

}

