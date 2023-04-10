package com.example.testing_mockito_junit.dao;


import com.example.testing_mockito_junit.model.User;

import java.util.Set;

public interface UserDao {


    User getUserByName(String name);

    Set<User> findAllUsers();
}
