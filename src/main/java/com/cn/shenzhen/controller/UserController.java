package com.cn.shenzhen.controller;

import com.cn.shenzhen.common.pojo.User;
import com.cn.shenzhen.serviece.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/query/{id}")
    public User queryUser(@PathVariable String id){
        return  userService.queryUser(id);
    }
}
