package com.leng.oldass.knob.controller;

import com.leng.oldass.knob.dto.ArticleVo;
import com.leng.oldass.knob.entity.Article;
import com.leng.oldass.knob.entity.BaseArticle;
import com.leng.oldass.knob.entity.History;
import com.leng.oldass.knob.entity.KnowBase;
import com.leng.oldass.knob.service.ArticleService;
import com.leng.oldass.knob.service.BaseArticleService;
import com.leng.oldass.knob.service.HistoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leng.oldass.knob.service.KnowBaseService;
import com.leng.oldass.login.entity.User;
import com.leng.oldass.login.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 历史记录(History)表控制层
 *
 * @author lengzq
 * @since 2022-05-06 23:03:10
 */
@RestController
@RequestMapping("history")
public class HistoryController {
    /**
     * 服务对象
     */
    @Resource
    private HistoryService historyService;

    @Resource
    private ArticleService articleService;

    @Resource
    private UserService userService;

    @Resource
    private BaseArticleService baseArticleService;

    @Resource
    private KnowBaseService knowBaseService;
    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param history 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<History>> selectAll(Page<History> page, History history) {

        return ResponseEntity.ok(this.historyService.page(page, new QueryWrapper<>(history)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<History> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.historyService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param history 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody History history) {
        return ResponseEntity.ok(this.historyService.save(history));
    }

    /**
     * 编辑数据
     *
     * @param history 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody History history) {
        return ResponseEntity.ok(this.historyService.updateById(history));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.historyService.removeByIds(idList));
    }

}

