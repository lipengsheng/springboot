package com.cn.shenzhen.service.impl;

import com.cn.shenzhen.service.UserJdbcService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/22 13:48
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJdbcServiceImplTest {

    @Autowired
    private UserJdbcService userJdbcService;

    @Test
    public void  testAddUser(){
        userJdbcService.addUser();
    }

    @Test
    public void  testAddUser2() throws Exception {
        userJdbcService.addUser2();
    }

    @Test
    public void  testAddUser3() throws Exception {
        userJdbcService.addUser3();
    }
}
