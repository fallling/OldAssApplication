package com.leng.oldass.calendar.entity;

import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户日程(UserCalendar)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:32:08
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCalendar extends Model<UserCalendar> {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;

    /**
     * ID
     */
    @TableId
    private String id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 日程ID
     */
    private String calendarId;

}

