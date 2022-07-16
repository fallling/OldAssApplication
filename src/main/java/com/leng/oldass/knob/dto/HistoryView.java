package com.leng.oldass.knob.dto;

import java.util.Date;
import java.io.Serial;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (HistoryView)表实体类
 *
 * @author lengzq
 * @since 2022-05-07 00:42:19
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class HistoryView extends Model<HistoryView> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 用户id
     */
    private String userId;
    /**
     * 文章id
     */
    private String articleId;
    /**
     * 文章标题
     */
    private String articleTitle;
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
    /**
     * 创建用户id
     */
    private String createUserId;
    /**
     * 用户昵称
     */
    private String createUserNickName;

}

