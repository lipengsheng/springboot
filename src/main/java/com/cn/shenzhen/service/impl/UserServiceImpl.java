package com.cn.shenzhen.service.impl;

import com.cn.shenzhen.common.pojo.User;
import com.cn.shenzhen.dao.UserDao;
import com.cn.shenzhen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao  userDao;  //这里报错不用管，不要紧

    @Override
    public User  queryUser(String id){
        return userDao.getById(id);
    }

}
