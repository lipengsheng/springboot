package com.cn.shenzhen.controller;

import com.cn.shenzhen.common.pojo.User;
import com.cn.shenzhen.serviece.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/query/{id}")
    public User queryUser(@PathVariable String id){
        log.debug("debug");
        log.info("info");
        return  userService.queryUser(id);
    }
}
