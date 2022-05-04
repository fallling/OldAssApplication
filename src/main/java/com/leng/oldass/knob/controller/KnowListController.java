package com.leng.oldass.knob.controller;

import com.leng.oldass.knob.entity.KnowList;
import com.leng.oldass.knob.service.KnowListService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 知识清单(KnowList)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:02:53
 */
@RestController
@RequestMapping("knowList")
public class KnowListController {
    /**
     * 服务对象
     */
    @Resource
    private KnowListService knowListService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param knowList 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<KnowList>> selectAll(Page<KnowList> page, KnowList knowList) {
        return ResponseEntity.ok(this.knowListService.page(page, new QueryWrapper<>(knowList)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<KnowList> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.knowListService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param knowList 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody KnowList knowList) {
        return ResponseEntity.ok(this.knowListService.save(knowList));
    }

    /**
     * 编辑数据
     *
     * @param knowList 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody KnowList knowList) {
        return ResponseEntity.ok(this.knowListService.updateById(knowList));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.knowListService.removeByIds(idList));
    }

}

