package com.leng.oldass.explore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.explore.dao.FollowUserDao;
import com.leng.oldass.explore.entity.FollowUser;
import com.leng.oldass.explore.service.FollowUserService;
import org.springframework.stereotype.Service;

/**
 * 关注用户(FollowUser)表服务实现类
 *
 * @author lengzq
 * @since 2022-03-19 19:44:39
 */
@Service("followUserService")
public class FollowUserServiceImpl extends ServiceImpl<FollowUserDao, FollowUser> implements FollowUserService {

}

