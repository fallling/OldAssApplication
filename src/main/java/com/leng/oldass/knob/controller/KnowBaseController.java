package com.leng.oldass.knob.controller;

import com.leng.oldass.knob.entity.KnowBase;
import com.leng.oldass.knob.service.KnowBaseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 知识库(KnowBase)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:02:48
 */
@RestController
@RequestMapping("knowBase")
public class KnowBaseController {
    /**
     * 服务对象
     */
    @Resource
    private KnowBaseService knowBaseService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param knowBase 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<KnowBase>> selectAll(Page<KnowBase> page, KnowBase knowBase) {
        return ResponseEntity.ok(this.knowBaseService.page(page, new QueryWrapper<>(knowBase)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<KnowBase> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.knowBaseService.getById(id));
    }

    /**
     * 创建知识库
     *
     * @param knowBase 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> createKnowBase(@RequestBody KnowBase knowBase) {
        return ResponseEntity.ok(this.knowBaseService.save(knowBase));
    }

    /**
     * 编辑数据
     *
     * @param knowBase 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody KnowBase knowBase) {
        return ResponseEntity.ok(this.knowBaseService.updateById(knowBase));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody @RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.knowBaseService.removeByIds(idList));
    }

}

