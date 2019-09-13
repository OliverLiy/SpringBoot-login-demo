package com.sdxb.springbootexample.service;

import com.sdxb.springbootexample.dao.UserDao;
import com.sdxb.springbootexample.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User get(User user) {
        // 通过Mapper的select方法查询用户
        return userDao.select(user);
    }
}
