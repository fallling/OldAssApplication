package com.leng.oldass.knob.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 文章(Article)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:30:12
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Article extends Model<Article> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 文章ID
     */
    @TableId
    private String articleId;
    /**
     * 文章标题
     */
    private String articleTitle;
    /**
     * 创建用户ID
     */
    private String createUserId;
    /**
     * 上次编辑时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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

