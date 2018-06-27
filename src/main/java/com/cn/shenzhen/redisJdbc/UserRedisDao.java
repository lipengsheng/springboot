package com.cn.shenzhen.redisJdbc;

import com.cn.shenzhen.common.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/26 17:35
 */
@Repository
public class UserRedisDao {

    @Autowired
    RedisTemplate<Object,Object>  redisTemplate;


    public void save(User user){
        redisTemplate.opsForValue().set(user.getId(),user);
    };

    public User getUser(String id){
        return (User)redisTemplate.opsForValue().get(id);
    }



}
