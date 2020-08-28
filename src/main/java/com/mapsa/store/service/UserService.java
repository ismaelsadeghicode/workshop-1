package com.mapsa.store.service;

import com.mapsa.store.dao.UserDao;
import com.mapsa.store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserDao userDao;


    public User getUserById(int id){
        User user = userDao.getUserById(id);
        return user;
    }

    public User getUserByUsername(String username){
        User user = userDao.getUserByUsername(username);
        return user;
    }

}
