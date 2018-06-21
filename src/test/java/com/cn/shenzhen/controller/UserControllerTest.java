package com.cn.shenzhen.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/21 18:40
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void  testQueryUser(){
        String userInfo= testRestTemplate.getForObject("/user/query/1",String.class);
        Assert.assertEquals(userInfo,"{\"id\":\"1\",\"name\":\"2\",\"age\":3}");
    }


}
