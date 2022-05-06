package com.leng.oldass.teamSpace.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leng.oldass.teamSpace.dao.MembersDao;
import com.leng.oldass.teamSpace.entity.Members;
import com.leng.oldass.teamSpace.service.MembersService;
import org.springframework.stereotype.Service;

/**
 * 成员(Members)表服务实现类
 *
 * @author lengzq
 * @since 2022-05-06 18:01:34
 */
@Service("membersService")
public class MembersServiceImpl extends ServiceImpl<MembersDao, Members> implements MembersService {

}

