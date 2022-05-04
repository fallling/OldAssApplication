package com.leng.oldass.knob.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author lengzq
 * @since 2022/4/17 2:39
 */
@Data
public class ArticleBo {
    @TableId
    private String articleId;
    /**
     * 文章标题
     */
    private String articleTitle;
    /**
     * 创建用户
     */
    private String createUser;

    private String createUserId;
    private String baseId;

    /**
     * 所属知识库
     */
    private String baseName;
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
