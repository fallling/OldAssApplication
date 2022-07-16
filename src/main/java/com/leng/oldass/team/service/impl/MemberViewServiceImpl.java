package com.leng.oldass.team.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.team.dao.MemberViewDao;
import com.leng.oldass.team.entity.MemberView;
import com.leng.oldass.team.service.MemberViewService;
import org.springframework.stereotype.Service;

/**
 * (MemberView)表服务实现类
 *
 * @author lengzq
 * @since 2022-05-13 00:35:33
 */
@Service("memberViewService")
public class MemberViewServiceImpl extends ServiceImpl<MemberViewDao, MemberView> implements MemberViewService {

}

