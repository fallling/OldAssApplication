package com.leng.oldass.calendar.controller;

import com.leng.oldass.calendar.entity.UserCalendar;
import com.leng.oldass.calendar.service.UserCalendarService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 用户日程(UserCalendar)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:10:17
 */
@RestController
@RequestMapping("userCalendar")
public class UserCalendarController {
    /**
     * 服务对象
     */
    @Resource
    private UserCalendarService userCalendarService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param userCalendar 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<UserCalendar>> selectAll(Page<UserCalendar> page, UserCalendar userCalendar) {
        return ResponseEntity.ok(this.userCalendarService.page(page, new QueryWrapper<>(userCalendar)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UserCalendar> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.userCalendarService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param userCalendar 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody UserCalendar userCalendar) {
        return ResponseEntity.ok(this.userCalendarService.save(userCalendar));
    }

    /**
     * 编辑数据
     *
     * @param userCalendar 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody UserCalendar userCalendar) {
        return ResponseEntity.ok(this.userCalendarService.updateById(userCalendar));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.userCalendarService.removeByIds(idList));
    }

}

