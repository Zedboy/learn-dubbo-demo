package com.dubbo.demo.api.service;

import com.baomidou.mybatisplus.service.IService;
import com.dubbo.demo.api.entity.UserInfo ;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author Auto Generator
 * @since 2018-07-16
 */
public interface IUserService extends IService<UserInfo> {

    UserInfo findUserInfo(String userName);

}
