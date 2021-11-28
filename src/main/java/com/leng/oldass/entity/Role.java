package com.leng.oldass.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * role表(Role)实体类
 *
 * @author lengzq
 * @since 2021-11-23 14:53:32
 */
@Data
public class Role implements Serializable {
    @Serial
    private static final long serialVersionUID = 979503982264956123L;
        /**
     * 角色id
     */
    private Integer id;
        /**
     * 角色名称
     */
    private String name;
        /**
     * 角色中文名称
     */
    private String nameZh;
}

