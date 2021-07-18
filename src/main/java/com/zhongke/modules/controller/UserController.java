package com.zhongke.modules.controller;

import com.zhongke.common.restful.JsonResult;
import com.zhongke.modules.entity.User;
import com.zhongke.modules.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/user")
    public JsonResult selUser(){
        List<User> users = userService.selUser();
        return JsonResult.buildSuccessResult(users);
    }
}
