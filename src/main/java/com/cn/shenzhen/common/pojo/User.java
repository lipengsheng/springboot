package com.cn.shenzhen.common.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/5/4下午2:01
 */
@Data
public class User implements Serializable {

    private String id;

    private String name;

    private Integer age;
}
