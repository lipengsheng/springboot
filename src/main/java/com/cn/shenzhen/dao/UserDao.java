package com.cn.shenzhen.dao;

import com.cn.shenzhen.common.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/4下午2:03
 */

public interface UserDao {

    User getById(String id);
}
