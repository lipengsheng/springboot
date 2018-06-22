package com.cn.shenzhen;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

/**
 * spring boot 启动类入口
 *
 */
@Slf4j
@SpringBootApplication
//这个集成mybaits要配置的注解，很关键，要注意
@MapperScan("com.cn.shenzhen.dao")
public class ShenZhenApplication {
    public static void main( String[] args ) {
        ApplicationContext  applicationContext=SpringApplication.run(ShenZhenApplication.class,args);
        DataSource dataSource=(DataSource) applicationContext.getBean("dataSource");
//        log.info(dataSource.getClass().toString());
        System.out.println(dataSource.getClass());
    }
}
