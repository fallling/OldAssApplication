package com.leng.oldass.favorites.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 收藏列表(FavoritesList)实体类
 *
 * @author xzmb
 * @since 2022-07-17 16:27:51
 */
public class FavoritesList implements Serializable {
    private static final long serialVersionUID = -98345956241971796L;
    /**
     * 记录标识
     */
    private Long id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 所属分组id
     */
    private Long groupId;
    /**
     * 文章id
     */
    private String articleId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

}

