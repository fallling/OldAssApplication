package com.leng.oldass.login.controller;

import com.leng.oldass.login.entity.User;
import com.leng.oldass.login.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 用户(User)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:03:48
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param user 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<User>> selectAll(Page<User> page, User user) {
        return ResponseEntity.ok(this.userService.page(page, new QueryWrapper<>(user)));
    }

    @GetMapping("/fuzzyQuery")
    public ResponseEntity<Page<User>> fuzzyQuery(Page<User> page, String arg) {
        return ResponseEntity.ok(this.userService.fuzzyQuery(page, arg));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<User> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.userService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param user 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.save(user));
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.updateById(user));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.userService.removeByIds(idList));
    }

}

