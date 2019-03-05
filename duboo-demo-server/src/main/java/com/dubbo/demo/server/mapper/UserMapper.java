package com.dubbo.demo.server.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dubbo.demo.api.entity.UserInfo;

/**
 * <p>
 * 系统用户表 Mapper 接口
 * </p>
 *
 * @author Auto Generator
 * @since 2018-07-16
 */
public interface UserMapper extends BaseMapper<UserInfo> {

    UserInfo findUserInfo(String userName);

}
