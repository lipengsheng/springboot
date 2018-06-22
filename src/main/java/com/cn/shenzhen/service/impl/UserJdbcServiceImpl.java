package com.cn.shenzhen.service.impl;

import com.cn.shenzhen.common.pojo.User;
import com.cn.shenzhen.jdbc.UserJdbcDao;
import com.cn.shenzhen.service.UserJdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
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

    /*
    spring事务-说说Propagation及其实现原理:参考网址:https://blog.csdn.net/yanyan19880509/article/details/53041564.
    事务默认的传播性是@Transactional(Propagation.REQUIRED).
    常用的传播性主要是@Transactional(Propagation.REQUIRED)  和  @Transactional(Propagation.REQUIRES_NEW)
    */

    /*
    说明:如果当前已经存在事务，那么加入该事务，如果不存在事务，创建一个事务，这是默认的传播属性值。
    @Transactional
    public void service(){
        serviceA();
        serviceB();
    }
    @Transactional
    serviceA();
    @Transactional
    serviceB();
    serviceA 和 serviceB 都声明了事务，默认情况下，propagation=PROPAGATION_REQUIRED，
    整个service调用过程中，只存在一个共享的事务，当有任何异常发生的时候，所有操作回滚。
    */


    /*
    说明：如果当前存在事务，先把当前事务相关内容封装到一个实体，然后重新创建一个新事务，接受这个实体为参数，用于事务的恢复。
    更直白的说法就是暂停当前事务(当前无事务则不需要)，创建一个新事务。 针对这种情况，两个事务没有依赖关系，
    可以实现新事务回滚了，但外部事务继续执行。

    @Transactional
    public void service(){
        serviceB();
        try{
            serviceA();
        }catch(Exception e){
        }
    }
    serviceB(){
        do sql
    }
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    serviceA(){
        do sql 1
        1/0;
        do sql 2
    }

    当调用service接口时，由于serviceA使用的是REQUIRES_NEW，它会创建一个新的事务，但由于serviceA抛出了运行时异常，
    导致serviceA整个被回滚了，而在service方法中，捕获了异常，所以serviceB是正常提交的。 注意，service中的try … catch 代码是必须的，
    否则service也会抛出异常，导致serviceB也被回滚。
    */


    /****
     * 分布式事务处理方案:首先利用本地事务以及传播性，配合使用try  catch语句对本地事务一个回滚操作或者一个逆向操作
     * 而对于第三方系统的事务，是先进行一系列查询确认，然后通过事务补偿处理。
     */



}
