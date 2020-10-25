package com.sjn.dao;

import com.sjn.opjo.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    List<User> findByName(String name);

    void addUser(User user);
}
