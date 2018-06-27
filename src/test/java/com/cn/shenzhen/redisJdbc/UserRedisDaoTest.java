package com.cn.shenzhen.redisJdbc;

import com.cn.shenzhen.common.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/26 18:17
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRedisDaoTest {

    @Autowired
    private  UserRedisDao  userRedisDao;


    @Test
    public   void  testSave(){
        User user=new User();
        user.setId("9");
        user.setName("lipengsheng");
        user.setAge(26);
        userRedisDao.save(user);
    }

    @Test
    public   void  getUser(){
        User user=userRedisDao.getUser("9");
        System.out.println(user);
    }



}
