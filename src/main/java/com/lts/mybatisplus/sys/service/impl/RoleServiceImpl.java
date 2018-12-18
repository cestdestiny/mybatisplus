package com.lts.mybatisplus.sys.service.impl;

import com.lts.mybatisplus.sys.entity.Role;
import com.lts.mybatisplus.sys.mapper.RoleMapper;
import com.lts.mybatisplus.sys.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2018-12-18
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
