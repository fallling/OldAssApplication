package com.leng.oldass.knob.entity;

import java.io.Serial;
import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 历史记录(History)表实体类
 *
 * @author lengzq
 * @since 2022-05-06 23:03:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class History extends Model<History> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 历史记录id
     */
    private String id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 文章id
     */
    private String articleId;

}

