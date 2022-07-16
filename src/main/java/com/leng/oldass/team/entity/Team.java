package com.leng.oldass.team.entity;

import java.util.Date;
import java.io.Serial;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 团队(Team)表实体类
 *
 * @author lengzq
 * @since 2022-05-06 18:00:50
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Team extends Model<Team> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;

    /**
     * 主键id
     */
    @TableId
    private String teamId;
    /**
     * 团队名称
     */
    private String teamName;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /**
     * 团队介绍
     */
    private String teamIntro;
    /**
     * 创建用户
     */
    private String createUser;
}

