package com.sjn.dao;

import com.sjn.opjo.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();

    List<User> findByName(String name);

    void addUser(User user);
}
