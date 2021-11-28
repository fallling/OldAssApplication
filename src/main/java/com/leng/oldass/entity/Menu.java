package com.leng.oldass.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * menu表(Menu)实体类
 *
 * @author lengzq
 * @since 2021-11-23 15:50:47
 */
@Data
public class Menu implements Serializable {
    @Serial
    private static final long serialVersionUID = 737351739046286579L;
        /**
     * 主键id
     */
    private Integer id;
        /**
     * 请求路径规则
     */
    private String url;
        /**
     * 路由path
     */
    private String path;
        /**
     * 组件名称
     */
    private String component;
        /**
     * 组件名
     */
    private String name;
        /**
     * 菜单图标
     */
    private String iconCls;
        /**
     * 菜单切换时是否保持存活
     */
    private Integer keepAlive;
        /**
     * 是否登录才能访问
     */
    private Integer requireAuth;
        /**
     * 父菜单id
     */
    private Integer parentId;
        /**
     * 是否可用，默认值:1
     */
    private Integer enabled;

    private List<Role> roles;

    private List<Menu> children;
}

