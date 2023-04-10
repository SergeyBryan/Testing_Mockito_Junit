package com.example.testing_mockito_junit.dao;

import com.example.testing_mockito_junit.model.User;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserDaoImpl implements UserDao {
    private final Set<User> listOfUsers = Set.of(
            new User("Артем"),
            new User("Валентин"),
            new User("Дмитрий"),
            new User("Матвей"),
            new User("Галина")
    );


    @Override
    public User getUserByName(String name) {
        for (User user : listOfUsers) {
            if (user.getName().contains(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public Set<User> findAllUsers() {
        return listOfUsers;
    }

}
