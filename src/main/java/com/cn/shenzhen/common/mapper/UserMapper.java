package com.cn.shenzhen.common.mapper;

import com.cn.shenzhen.common.pojo.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        String id = resultSet.getString("id");
        String name = resultSet.getString("name");
        Integer age=resultSet.getInt("age");
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
