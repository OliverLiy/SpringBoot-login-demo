package com.sdxb.springbootexample.dao;

import com.sdxb.springbootexample.entity.User;

public interface UserDao {
    User select(User user);
}
