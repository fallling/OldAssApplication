package com.leng.oldass.calendar.controller;

import com.leng.oldass.calendar.entity.UserTodoList;
import com.leng.oldass.calendar.service.UserTodoListService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 用户任务(UserTodoList)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:04:14
 */
@RestController
@RequestMapping("userTodoList")
public class UserTodoListController {
    /**
     * 服务对象
     */
    @Resource
    private UserTodoListService userTodoListService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param userTodoList 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<UserTodoList>> selectAll(Page<UserTodoList> page, UserTodoList userTodoList) {
        return ResponseEntity.ok(this.userTodoListService.page(page, new QueryWrapper<>(userTodoList)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UserTodoList> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.userTodoListService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param userTodoList 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody UserTodoList userTodoList) {
        return ResponseEntity.ok(this.userTodoListService.save(userTodoList));
    }

    /**
     * 编辑数据
     *
     * @param userTodoList 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody UserTodoList userTodoList) {
        return ResponseEntity.ok(this.userTodoListService.updateById(userTodoList));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.userTodoListService.removeByIds(idList));
    }

}

