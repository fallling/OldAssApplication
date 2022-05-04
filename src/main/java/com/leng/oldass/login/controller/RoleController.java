package com.leng.oldass.login.controller;

import com.leng.oldass.login.entity.Role;
import com.leng.oldass.login.service.RoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 角色(Role)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:03:21
 */
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param role 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<Role>> selectAll(Page<Role> page, Role role) {
        return ResponseEntity.ok(this.roleService.page(page, new QueryWrapper<>(role)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Role> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.roleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param role 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody Role role) {
        return ResponseEntity.ok(this.roleService.save(role));
    }

    /**
     * 编辑数据
     *
     * @param role 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Role role) {
        return ResponseEntity.ok(this.roleService.updateById(role));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.roleService.removeByIds(idList));
    }

}

