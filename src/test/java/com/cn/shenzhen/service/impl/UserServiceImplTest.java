package com.cn.shenzhen.service.impl;

import com.cn.shenzhen.common.pojo.User;
import com.cn.shenzhen.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/21 13:55
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Autowired
    private Environment environment;

    @Test
    public void  testQueryUser(){
        User user=userService.queryUser("1");
//        log.info(user.getId());
//        Assert.assertNotNull(user.getId());
          Assert.assertEquals(environment.getProperty("name"),"lipengsheng");
    }

}
