package com.cn.shenzhen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动类入口
 *
 */
@SpringBootApplication
//这个集成mybaits要配置的注解，很关键，要注意
@MapperScan("com.cn.shenzhen.dao")
public class ShenZhenApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ShenZhenApplication.class,args);
    }
}
