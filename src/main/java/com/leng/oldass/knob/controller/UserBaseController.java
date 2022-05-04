package com.leng.oldass.knob.controller;

import com.leng.oldass.knob.entity.UserBase;
import com.leng.oldass.knob.service.UserBaseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 用户知识库(UserBase)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:05:29
 */
@RestController
@RequestMapping("userBase")
public class UserBaseController {
    /**
     * 服务对象
     */
    @Resource
    private UserBaseService userBaseService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param userBase 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<UserBase>> selectAll(Page<UserBase> page, UserBase userBase) {
        return ResponseEntity.ok(this.userBaseService.page(page, new QueryWrapper<>(userBase)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UserBase> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.userBaseService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param userBase 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody UserBase userBase) {
        return ResponseEntity.ok(this.userBaseService.save(userBase));
    }

    /**
     * 编辑数据
     *
     * @param userBase 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody UserBase userBase) {
        return ResponseEntity.ok(this.userBaseService.updateById(userBase));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.userBaseService.removeByIds(idList));
    }

}

