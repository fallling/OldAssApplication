package com.leng.oldass.knob.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 清单文章(ListArticle)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:31:07
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ListArticle extends Model<ListArticle> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * ID
     */
    @TableId
    private String id;
    /**
     * 清单ID
     */
    private String listId;
    /**
     * 文章ID
     */
    private String articleId;
}

