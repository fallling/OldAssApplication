package com.leng.oldass.explore.controller;

import com.leng.oldass.explore.entity.RecommendArticle;
import com.leng.oldass.explore.service.RecommendArticleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 推荐文章(RecommendArticle)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:08:50
 */
@RestController
@RequestMapping("recommendArticle")
public class RecommendArticleController {
    /**
     * 服务对象
     */
    @Resource
    private RecommendArticleService recommendArticleService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param recommendArticle 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<RecommendArticle>> selectAll(Page<RecommendArticle> page, RecommendArticle recommendArticle) {
        return ResponseEntity.ok(this.recommendArticleService.page(page, new QueryWrapper<>(recommendArticle)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<RecommendArticle> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.recommendArticleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param recommendArticle 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody RecommendArticle recommendArticle) {
        return ResponseEntity.ok(this.recommendArticleService.save(recommendArticle));
    }

    /**
     * 编辑数据
     *
     * @param recommendArticle 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody RecommendArticle recommendArticle) {
        return ResponseEntity.ok(this.recommendArticleService.updateById(recommendArticle));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.recommendArticleService.removeByIds(idList));
    }

}

