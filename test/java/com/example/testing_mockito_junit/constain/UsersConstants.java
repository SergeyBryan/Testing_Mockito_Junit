package com.example.testing_mockito_junit.constain;

import com.example.testing_mockito_junit.model.User;

import java.util.Set;

public class UsersConstants {

    public static final User ARTEM = new User("Артем");
    public static final User VALENTIN = new User("Валентин");
    public static final User DIMA = new User("Дмитрий");
    public static final User MATVEY = new User("Матвей");
    public static final User GALINA = new User("Галина");
    public static final User MONIKA = new User("Моника");
    public static final Set<User> USER_SET = Set.of(
            ARTEM,
            VALENTIN,
            GALINA,
            MATVEY,
            DIMA);
}
