package com.mylab021.service.impl;

import com.mylab021.dao.UserDao;
import com.mylab021.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void show() {
        System.out.println("UserService Show Method");
    }
}
