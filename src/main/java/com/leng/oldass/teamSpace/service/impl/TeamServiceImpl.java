package com.leng.oldass.teamSpace.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.teamSpace.dao.TeamDao;
import com.leng.oldass.teamSpace.entity.Team;
import com.leng.oldass.teamSpace.service.TeamService;
import org.springframework.stereotype.Service;

/**
 * 团队(Team)表服务实现类
 *
 * @author lengzq
 * @since 2022-05-06 18:00:51
 */
@Service("teamService")
public class TeamServiceImpl extends ServiceImpl<TeamDao, Team> implements TeamService {

}

