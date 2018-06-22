package com.cn.shenzhen.jdbc;

import com.cn.shenzhen.common.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/22 11:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJdbcDaoTest {


    @Autowired
    private  UserJdbcDao userJdbcDao;


    @Test
    public  void  testAddUser(){
        try {
            userJdbcDao.addUser();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void  testGetUser(){
        try {
            List<User> userList=userJdbcDao.getUser("2");
            Assert.assertNotEquals(userList.size(),0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
