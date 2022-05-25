package com.wfs.springbootmybatis;

import com.wfs.springbootmybatis.bean.User;
import com.wfs.springbootmybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootMybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectUser() {
        System.out.println(("----- 开始测试 mybatis-plus 查询数据 ------"));

        List<User> userList = userMapper.selectList(null);

        userList.forEach(System.out::println);

    }
}