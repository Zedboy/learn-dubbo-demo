package com.dubbo.demo.client.contorller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo.api.entity.UserInfo;
import com.dubbo.demo.api.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 系统用户表 前端控制器
 * </p>
 *
 * @author Auto Generator
 * @since 2018-07-10
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private IUserService iUserService;

    @GetMapping("/find")
    public UserInfo toHtml(){
        return iUserService.findUserInfo("test");
    }
}