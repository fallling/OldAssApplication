package com.leng.oldass.knob.controller;

import com.leng.oldass.knob.entity.BaseArticle;
import com.leng.oldass.knob.service.BaseArticleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 知识库文章(BaseArticle)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:30:17
 */
@RestController
@RequestMapping("baseArticle")
public class BaseArticleController {
    /**
     * 服务对象
     */
    @Resource
    private BaseArticleService baseArticleService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param baseArticle 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<BaseArticle>> selectAll(Page<BaseArticle> page, BaseArticle baseArticle) {
        return ResponseEntity.ok(this.baseArticleService.page(page, new QueryWrapper<>(baseArticle)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<BaseArticle> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.baseArticleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param baseArticle 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody BaseArticle baseArticle) {
        return ResponseEntity.ok(this.baseArticleService.save(baseArticle));
    }

    /**
     * 编辑数据
     *
     * @param baseArticle 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody BaseArticle baseArticle) {
        return ResponseEntity.ok(this.baseArticleService.updateById(baseArticle));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.baseArticleService.removeByIds(idList));
    }

}

