package com.leng.oldass.knob.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leng.oldass.knob.dto.ArticleBo;
import com.leng.oldass.knob.dto.ArticleVo;
import com.leng.oldass.knob.entity.Article;
import com.leng.oldass.knob.entity.BaseArticle;
import com.leng.oldass.knob.entity.UserBase;
import com.leng.oldass.knob.service.ArticleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leng.oldass.knob.service.BaseArticleService;
import com.leng.oldass.knob.service.UserBaseService;
import com.leng.oldass.login.entity.User;
import com.leng.oldass.login.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
/**
 * 文章(Article)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:02:21
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleService articleService;

    @Resource
    private BaseArticleService baseArticleService;

    @Resource
    private UserBaseService userBaseService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param article 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<IPage<ArticleVo>> selectAll(Page<ArticleVo> page, ArticleVo article) {
        return ResponseEntity.ok(this.articleService.articleList(page, new QueryWrapper<>(article)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Article> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.articleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param articleBo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Article> createArticle(@RequestBody ArticleBo articleBo) {
        Article article = new Article();
        article.setArticleTitle( articleBo.getArticleTitle() );
        Date date = new Date(System.currentTimeMillis());
        article.setLastEditTime(date);
        this.articleService.save(article);
        BaseArticle baseArticle = new BaseArticle();
        baseArticle.setArticleId(article.getArticleId());
        baseArticle.setBaseId(articleBo.getBaseId());
        logger.info("BaseArticle: "+baseArticle);
        this.baseArticleService.save(baseArticle);
        UserBase userBase = new UserBase();
        userBase.setBaseId(articleBo.getBaseId());
        userBase.setUserId(articleBo.getCreateUserId());
        this.userBaseService.save(userBase);
        return ResponseEntity.ok(article);
    }

    /**
     * 编辑数据
     *
     * @param article 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Article article) {
        return ResponseEntity.ok(this.articleService.updateById(article));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.articleService.removeByIds(idList));
    }

}

