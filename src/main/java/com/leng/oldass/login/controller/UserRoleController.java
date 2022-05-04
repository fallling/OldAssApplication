package com.leng.oldass.login.controller;

import com.leng.oldass.login.entity.UserRole;
import com.leng.oldass.login.service.UserRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 用户角色(UserRole)表控制层
 *
 * @author lengzq
 * @since 2022-03-20 02:04:08
 */
@RestController
@RequestMapping("userRole")
public class UserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private UserRoleService userRoleService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param userRole 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<UserRole>> selectAll(Page<UserRole> page, UserRole userRole) {
        return ResponseEntity.ok(this.userRoleService.page(page, new QueryWrapper<>(userRole)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UserRole> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.userRoleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param userRole 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody UserRole userRole) {
        return ResponseEntity.ok(this.userRoleService.save(userRole));
    }

    /**
     * 编辑数据
     *
     * @param userRole 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody UserRole userRole) {
        return ResponseEntity.ok(this.userRoleService.updateById(userRole));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.userRoleService.removeByIds(idList));
    }

}

