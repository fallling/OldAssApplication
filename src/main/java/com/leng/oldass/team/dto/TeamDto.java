package com.leng.oldass.team.dto;

import lombok.Data;

import java.util.Date;

/**
 * 团队数据传输类
 *
 * @author lengzq
 * @since 2022/5/13 16:10
 */
@Data
public class TeamDto {

    /**
     * 主键id
     */
    private String teamId;
    /**
     * 团队名称
     */
    private String teamName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 团队介绍
     */
    private String teamIntro;
    /**
     * 创建用户
     */
    private String createUser;
    /**
     * 成员
     */
    private String[] members;
}
