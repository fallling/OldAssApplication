package com.leng.oldass.knob.controller;

import com.leng.oldass.knob.entity.UserList;
import com.leng.oldass.knob.service.UserListService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 用户知识清单(UserList)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:04:02
 */
@RestController
@RequestMapping("userList")
public class UserListController {
    /**
     * 服务对象
     */
    @Resource
    private UserListService userListService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param userList 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<UserList>> selectAll(Page<UserList> page, UserList userList) {
        return ResponseEntity.ok(this.userListService.page(page, new QueryWrapper<>(userList)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UserList> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.userListService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param userList 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody UserList userList) {
        return ResponseEntity.ok(this.userListService.save(userList));
    }

    /**
     * 编辑数据
     *
     * @param userList 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody UserList userList) {
        return ResponseEntity.ok(this.userListService.updateById(userList));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.userListService.removeByIds(idList));
    }

}

