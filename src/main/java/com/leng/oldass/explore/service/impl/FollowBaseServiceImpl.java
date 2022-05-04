package com.leng.oldass.explore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.explore.dao.FollowBaseDao;
import com.leng.oldass.explore.entity.FollowBase;
import com.leng.oldass.explore.service.FollowBaseService;
import org.springframework.stereotype.Service;

/**
 * 关注知识库(FollowBase)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:44:19
 */
@Service("followBaseService")
public class FollowBaseServiceImpl extends ServiceImpl<FollowBaseDao, FollowBase> implements FollowBaseService {

}

