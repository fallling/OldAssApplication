package com.leng.oldass.teamSpace.controller;

import com.leng.oldass.teamSpace.entity.Members;
import com.leng.oldass.teamSpace.entity.Team;
import com.leng.oldass.teamSpace.service.MembersService;
import com.leng.oldass.teamSpace.service.TeamService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * 团队(Team)表控制层
 *
 * @author lengzq
 * @since 2022-05-06 18:00:49
 */
@RestController
@RequestMapping("team")
public class TeamController {
    /**
     * 服务对象
     */
    @Resource
    private TeamService teamService;

    @Resource
    private MembersService membersService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param team 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResponseEntity<Page<Team>> selectAll(Page<Team> page, Team team) {
        return ResponseEntity.ok(this.teamService.page(page, new QueryWrapper<>(team)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Team> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.teamService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param team 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> createTeam(@RequestBody Team team) {
        try {
            team.setTeamId(String.valueOf(UUID.randomUUID()));
            Members members = new Members();
            members.setUserId(team.getCreateUser());
            members.setTeamId(team.getTeamId());
            members.setRoleId("1");
            this.teamService.save(team);
            this.membersService.save(members);
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(false);
    }

    /**
     * 编辑数据
     *
     * @param team 实体
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Team team) {
        return ResponseEntity.ok(this.teamService.updateById(team));
    }

    /**
     * 删除数据
     *
     * @param idList 主键
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("idList")  List<String> idList) {
        return ResponseEntity.ok(this.teamService.removeByIds(idList));
    }

}

