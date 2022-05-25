package com.wfs.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wfs.springbootmybatis.mapper")
public class SpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }

}


/*
*
* 测试过程中出现的坑：
* 1.jdk版本与lombok的版本不兼容   jdk使用的是17版本 lombok使用的是12版本  这两个版本不兼容就会报错 java.lang.Exception错误   解决方案：将lombok版本改为18
* 2.采用默认映射的方式对应数据时 数据库中的表名必须与类名相同，字段名与属性名相同
*   采用注解方式对应数据时  可以直接使用@TableName（“表名”）的方法指定数据表
*
*
*
*
*
* */
