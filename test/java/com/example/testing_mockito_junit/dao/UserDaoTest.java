package com.example.testing_mockito_junit.dao;

import com.example.testing_mockito_junit.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.example.testing_mockito_junit.constain.UsersConstants.*;

public class UserDaoTest {

    private final UserDaoImpl out = new UserDaoImpl();


    private final User USER = new User("Артем");


    @Test
    public void shouldFindUserByNameReturnUser() {
        User user = out.getUserByName(USER.getName());
        Assertions.assertEquals(user, USER);
    }

    @Test
    public void shouldFindUserReturnNull() {
        User user = out.getUserByName(MONIKA.getName());
        Assertions.assertNull(user);
    }

    @Test
    public void shouldFindAllUsersReturnSetOfUsers() {
        Assertions.assertTrue(out.findAllUsers().size() > 0);
    }

}
