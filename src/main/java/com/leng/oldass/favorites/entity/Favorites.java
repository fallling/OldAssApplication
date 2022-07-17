package com.leng.oldass.favorites.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 收藏表(Favorites)实体类
 *
 * @author xzmb
 * @since 2022-07-17 16:05:07
 */
public class Favorites implements Serializable {
    private static final long serialVersionUID = -16777744540499151L;
    /**
     * 记录标识
     */
    private Long id;
    /**
     * 列表名称
     */
    private String name;
    /**
     * 创建时间
     */
    private Date creatTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

}

