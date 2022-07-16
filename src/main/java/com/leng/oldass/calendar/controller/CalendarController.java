package com.leng.oldass.calendar.controller;

import com.leng.oldass.calendar.entity.Calendar;
import com.leng.oldass.calendar.service.CalendarService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 日程(Calendar)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:01:33
 */
@RestController
@RequestMapping("calendar")
public class CalendarController {
    /**
     * 服务对象
     */
    @Resource
    private CalendarService calendarService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param calendar 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<Calendar>> selectAll(Page<Calendar> page, Calendar calendar) {
        return ResponseEntity.ok(this.calendarService.page(page, new QueryWrapper<>(calendar)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Calendar> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.calendarService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param calendar 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody Calendar calendar) {
        System.out.println(calendar);
        return ResponseEntity.ok(this.calendarService.save(calendar));
    }

    /**
     * 编辑数据
     *
     * @param calendar 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Calendar calendar) {
        return ResponseEntity.ok(this.calendarService.updateById(calendar));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.calendarService.removeByIds(idList));
    }

}

