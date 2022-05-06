package com.leng.oldass.knob.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 知识库文章(BaseArticle)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:30:17
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseArticle extends Model<BaseArticle> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * ID
     */
    @TableId
    private String id;
    /**
     * 知识库ID
     */
    private String baseId;
    /**
     * 文章ID
     */
    private String articleId;
}

