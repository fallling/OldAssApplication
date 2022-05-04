package com.leng.oldass.explore.controller;

import com.leng.oldass.explore.entity.RecommendList;
import com.leng.oldass.explore.service.RecommendListService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 推荐清单(RecommendList)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:08:57
 */
@RestController
@RequestMapping("recommendList")
public class RecommendListController {
    /**
     * 服务对象
     */
    @Resource
    private RecommendListService recommendListService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param recommendList 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<RecommendList>> selectAll(Page<RecommendList> page, RecommendList recommendList) {
        return ResponseEntity.ok(this.recommendListService.page(page, new QueryWrapper<>(recommendList)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<RecommendList> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.recommendListService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param recommendList 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody RecommendList recommendList) {
        return ResponseEntity.ok(this.recommendListService.save(recommendList));
    }

    /**
     * 编辑数据
     *
     * @param recommendList 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody RecommendList recommendList) {
        return ResponseEntity.ok(this.recommendListService.updateById(recommendList));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.recommendListService.removeByIds(idList));
    }

}

