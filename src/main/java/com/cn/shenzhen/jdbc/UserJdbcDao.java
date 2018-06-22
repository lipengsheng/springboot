package com.cn.shenzhen.jdbc;

import com.cn.shenzhen.common.mapper.UserMapper;
import com.cn.shenzhen.common.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/22 9:29
 */
@Repository
public class UserJdbcDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public  void  addUser() throws SQLException {
        String sql="insert into user(name,age) values('lipengsheng',26)";
        jdbcTemplate.execute(sql);
    }

    public List<User> getUser(String id) throws SQLException {
        String sql="select * from  user  where  id="+id+"";
        List<User> userList= jdbcTemplate.query(sql,new UserMapper());
        return userList;
    }



}
