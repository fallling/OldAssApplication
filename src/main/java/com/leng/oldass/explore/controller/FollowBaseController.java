package com.leng.oldass.explore.controller;

import com.leng.oldass.explore.entity.FollowBase;
import com.leng.oldass.explore.service.FollowBaseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 关注知识库(FollowBase)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:08:16
 */
@RestController
@RequestMapping("followBase")
public class FollowBaseController {
    /**
     * 服务对象
     */
    @Resource
    private FollowBaseService followBaseService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param followBase 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<FollowBase>> selectAll(Page<FollowBase> page, FollowBase followBase) {
        return ResponseEntity.ok(this.followBaseService.page(page, new QueryWrapper<>(followBase)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<FollowBase> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.followBaseService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param followBase 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody FollowBase followBase) {
        return ResponseEntity.ok(this.followBaseService.save(followBase));
    }

    /**
     * 编辑数据
     *
     * @param followBase 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody FollowBase followBase) {
        return ResponseEntity.ok(this.followBaseService.updateById(followBase));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.followBaseService.removeByIds(idList));
    }

}

