package com.cn.shenzhen.service;

import com.cn.shenzhen.common.mapper.UserMapper;
import com.cn.shenzhen.common.pojo.User;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/22 13:26
 */
public interface UserJdbcService {


    void addUser();

    List<User> getUser(String id) throws SQLException;


    void addUser2() throws Exception;

    void addUser3() throws Exception;


}
