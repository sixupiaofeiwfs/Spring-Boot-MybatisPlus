package com.wfs.springbootmybatis.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;


    private String name;

    private Integer age;

    private Integer gender;
}

/*
* @Data
* 注解在类上 直接提供类的set get equals hashCode  canEqual toString方法
*
*@Builder的作用：
* 生成一个全属性的构造器
* 生成了一个返回静态内部类UserBuilder对象的方法
* 生成了一个静态内部类UserBuilder，这个静态内部类包含User类的四个属性，无参构造器，四个方法名为属性名的方法，返回User对象的build 方法，输出静态内部类三个属性的toString方法
*
* 建造者使用过程：
* User.UserBuilder builder=User.builder();
* builder.id(1111)
* .name("赵六")
* .age(15)
* .gender(1).build();
* System.out.println(builder);
*
*
* */