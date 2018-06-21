package com.cn.shenzhen.service;

import com.cn.shenzhen.common.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/21 13:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void  queryUserTest(){
        User user=userService.queryUser("1");

    }

}
