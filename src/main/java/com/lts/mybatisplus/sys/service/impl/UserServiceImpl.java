package com.lts.mybatisplus.sys.service.impl;

import com.lts.mybatisplus.sys.entity.User;
import com.lts.mybatisplus.sys.mapper.UserMapper;
import com.lts.mybatisplus.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2018-12-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
