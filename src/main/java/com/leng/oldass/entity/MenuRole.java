package com.leng.oldass.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * menu_role表(MenuRole)实体类
 *
 * @author lengzq
 * @since 2021-11-24 15:52:03
 */
@Data
public class MenuRole implements Serializable {
    private static final long serialVersionUID = 982652574951990979L;
        /**
     * 主键id
     */
    private Integer id;
        /**
     * 菜单id
     */
    private Integer menuid;
        /**
     * 角色id
     */
    private Integer roleid;
}

