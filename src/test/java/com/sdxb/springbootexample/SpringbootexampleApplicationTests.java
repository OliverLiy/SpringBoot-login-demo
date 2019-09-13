package com.sdxb.springbootexample;

import com.sdxb.springbootexample.entity.User;
import com.sdxb.springbootexample.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.sdxb.springbootexample.dao")
public class SpringbootexampleApplicationTests {

    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {

        User user1=new User("aa","aa");
        User user=userService.get(user1);
        System.out.println(user.getPassword());
    }

}
