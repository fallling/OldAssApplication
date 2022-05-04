package com.leng.oldass.knob.controller;

import com.leng.oldass.knob.entity.ListArticle;
import com.leng.oldass.knob.service.ListArticleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 清单文章(ListArticle)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:03:07
 */
@RestController
@RequestMapping("listArticle")
public class ListArticleController {
    /**
     * 服务对象
     */
    @Resource
    private ListArticleService listArticleService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param listArticle 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<ListArticle>> selectAll(Page<ListArticle> page, ListArticle listArticle) {
        return ResponseEntity.ok(this.listArticleService.page(page, new QueryWrapper<>(listArticle)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ListArticle> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.listArticleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param listArticle 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody ListArticle listArticle) {
        return ResponseEntity.ok(this.listArticleService.save(listArticle));
    }

    /**
     * 编辑数据
     *
     * @param listArticle 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody ListArticle listArticle) {
        return ResponseEntity.ok(this.listArticleService.updateById(listArticle));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.listArticleService.removeByIds(idList));
    }

}

