package com.leng.oldass.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * user_role表(UserRole)实体类
 *
 * @author lengzq
 * @since 2021-11-24 15:52:42
 */
@Data
public class UserRole implements Serializable {
    private static final long serialVersionUID = 263800315865354843L;
        /**
     * 主键id
     */
    private Integer id;
        /**
     * 操作员id
     */
    private Integer userid;
        /**
     * 角色id
     */
    private Integer roleid;
}

