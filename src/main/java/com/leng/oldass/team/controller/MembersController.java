package com.leng.oldass.team.controller;

import com.leng.oldass.team.entity.MemberView;
import com.leng.oldass.team.entity.Members;
import com.leng.oldass.team.service.MemberViewService;
import com.leng.oldass.team.service.MembersService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
/**
 * 成员(Members)表控制层
 *
 * @author lengzq
 * @since 2022-05-06 18:01:34
 */
@RestController
@RequestMapping("members")
public class MembersController {
    /**
     * 服务对象
     */
    @Resource
    private MembersService membersService;

    @Resource
    private MemberViewService memberViewService;
    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param memberView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<MemberView>> selectAllByTeamId(Page<MemberView> page, MemberView memberView) {
        return ResponseEntity.ok(this.memberViewService.page(page, new QueryWrapper<>(memberView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Members> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.membersService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param members 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody Members members) {
        return ResponseEntity.ok(this.membersService.save(members));
    }

    /**
     * 编辑数据
     *
     * @param members 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Members members) {
        return ResponseEntity.ok(this.membersService.updateById(members));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.membersService.removeByIds(idList));
    }
}

