package com.leng.oldass.knob.dto;

import java.util.Date;
import java.io.Serial;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (ArticleView)表实体类
 *
 * @author lengzq
 * @since 2022-05-07 00:42:04
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ArticleView extends Model<ArticleView> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 文章标题
     */
    private String articleTitle;
    /**
     * 文章id
     */
    private String articleId;
    /**
     * 知识库id
     */
    private String baseId;
    /**
     * 知识库名称
     */
    private String baseName;
    /**
     * 创建用户id
     */
    private String createUserId;
    /**
     * 上次编辑时间
     */
    private Date lastEditTime;
    /**
     * 内容
     */
    private String content;
    /**
     * 点赞数
     */
    private Integer thumbs;
    /**
     * 阅读数
     */
    private Integer readNum;

}

