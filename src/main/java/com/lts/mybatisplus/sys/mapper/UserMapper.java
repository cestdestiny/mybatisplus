package com.lts.mybatisplus.sys.mapper;

import com.lts.mybatisplus.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 系统用户 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2018-12-18
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User selectUserById(@Param("username")String username);
}
