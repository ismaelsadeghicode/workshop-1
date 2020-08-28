package com.mapsa.store.dao;

import com.mapsa.store.model.User;

import java.util.List;


public interface UserDao {

    List<User> findAllUsers();
    User getUserById(int id);
    User getUserByUsername(String username);
    void insertUser(User user);
    void updateUser(User user);
    void deleleUser(User user);

}
