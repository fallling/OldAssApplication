package com.leng.oldass.calendar.controller;

import com.leng.oldass.calendar.entity.TodoList;
import com.leng.oldass.calendar.service.TodoListService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 任务(TodoList)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:03:43
 */
@RestController
@RequestMapping("todoList")
public class TodoListController {
    /**
     * 服务对象
     */
    @Resource
    private TodoListService todoListService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param todoList 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<TodoList>> selectAll(Page<TodoList> page, TodoList todoList) {
        return ResponseEntity.ok(this.todoListService.page(page, new QueryWrapper<>(todoList)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TodoList> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.todoListService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param todoList 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody TodoList todoList) {
        return ResponseEntity.ok(this.todoListService.save(todoList));
    }

    /**
     * 编辑数据
     *
     * @param todoList 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody TodoList todoList) {
        return ResponseEntity.ok(this.todoListService.updateById(todoList));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.todoListService.removeByIds(idList));
    }

}

