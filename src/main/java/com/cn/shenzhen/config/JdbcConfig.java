package com.cn.shenzhen.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * @Author: lipengsheng
 * @Date: 2018/6/22 10:50
 */
@Configuration
public class JdbcConfig {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Autowired
    private Environment environment;

    @Primary
    @Bean(name="dataSource")
    public DataSource  dataSource(){
        driverClassName=environment.getProperty("spring.datasource.driver-class-name");
        url=environment.getProperty("spring.datasource.url");
        username=environment.getProperty("spring.datasource.username");
        password=environment.getProperty("spring.datasource.password");
        DruidDataSource  druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

}
