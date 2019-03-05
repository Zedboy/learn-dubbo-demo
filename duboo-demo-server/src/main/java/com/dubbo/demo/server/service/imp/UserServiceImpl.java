package com.dubbo.demo.server.service.imp;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dubbo.demo.api.entity.UserInfo ;
import com.dubbo.demo.server.mapper.UserMapper ;
import com.dubbo.demo.api.service.IUserService ;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author Auto Generator
 * @since 2018-07-16
 */
@Service(version = "1.0.0", timeout = 60000)
public class UserServiceImpl extends ServiceImpl<UserMapper, UserInfo> implements IUserService {

    @Override
    public UserInfo findUserInfo(String userName) {
        return this.baseMapper.findUserInfo(userName);
    }
}