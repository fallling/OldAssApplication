package com.leng.oldass.knob.controller;

import com.leng.oldass.knob.dto.KnowBaseVo;
import com.leng.oldass.knob.entity.KnowBase;
import com.leng.oldass.knob.entity.UserBase;
import com.leng.oldass.knob.service.KnowBaseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leng.oldass.knob.service.KnowViewService;
import com.leng.oldass.knob.service.UserBaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

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

    @Resource
    private UserBaseService userBaseService;

    @Resource
    private KnowViewService knowViewService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param knowBaseVo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<KnowBaseVo>> selectAll(Page<KnowBaseVo> page, KnowBaseVo knowBaseVo) {
        return ResponseEntity.ok(this.knowViewService.page(page, new QueryWrapper<>(knowBaseVo)));
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
     * @param knowBaseVo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> createKnowBase(@RequestBody KnowBaseVo knowBaseVo) {
        try {
            KnowBase knowBase = new KnowBase();
            knowBase.setBaseId(String.valueOf(UUID.randomUUID()));
            knowBase.setBaseName(knowBaseVo.getBaseName());
            knowBase.setBaseIntro(knowBaseVo.getBaseIntro());
            knowBase.setCreateTime(knowBaseVo.getCreateTime());

            UserBase userBase = new UserBase();
            userBase.setUserId(knowBaseVo.getUserId());
            userBase.setBaseId(knowBase.getBaseId());
            this.userBaseService.save(userBase);
            this.knowBaseService.save(knowBase);
            return ResponseEntity.ok(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.ok(false);
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

