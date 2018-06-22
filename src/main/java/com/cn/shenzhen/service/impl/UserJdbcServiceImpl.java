package com.cn.shenzhen.service.impl;

import com.cn.shenzhen.common.pojo.User;
import com.cn.shenzhen.jdbc.UserJdbcDao;
import com.cn.shenzhen.service.UserJdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/22 13:34
 */
@Service
public class UserJdbcServiceImpl implements UserJdbcService {

    @Autowired
    private UserJdbcDao userJdbcDao;


    @Override
    @Transactional
    public void addUser()  {
        try {
            userJdbcDao.addUser();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //throw  new  RuntimeException("exception!");
    }

    @Override
    public List<User> getUser(String id) throws SQLException {
        return null;
    }
    //默认只是对运行时异常RuntimeException检查
    //通过设置rollbackFor属性来控制什么样的异常回滚
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addUser2() throws Exception {
        userJdbcDao.addUser();
        throw new FileNotFoundException("exp!");
    }

    //默认只是对运行时异常RuntimeException检查
    //通过设置noRollbackFor属性来控制什么样的异常不进行回滚
    @Override
    @Transactional(noRollbackFor = NullPointerException.class)
    public void addUser3() throws Exception {
        userJdbcDao.addUser();
        throw new NullPointerException("null");
    }


}
