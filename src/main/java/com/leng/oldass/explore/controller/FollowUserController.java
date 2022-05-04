package com.leng.oldass.explore.controller;

import com.leng.oldass.explore.entity.FollowUser;
import com.leng.oldass.explore.service.FollowUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 关注用户(FollowUser)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:08:38
 */
@RestController
@RequestMapping("followUser")
public class FollowUserController {
    /**
     * 服务对象
     */
    @Resource
    private FollowUserService followUserService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param followUser 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<FollowUser>> selectAll(Page<FollowUser> page, FollowUser followUser) {
        return ResponseEntity.ok(this.followUserService.page(page, new QueryWrapper<>(followUser)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<FollowUser> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.followUserService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param followUser 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody FollowUser followUser) {
        return ResponseEntity.ok(this.followUserService.save(followUser));
    }

    /**
     * 编辑数据
     *
     * @param followUser 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody FollowUser followUser) {
        return ResponseEntity.ok(this.followUserService.updateById(followUser));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.followUserService.removeByIds(idList));
    }

}

