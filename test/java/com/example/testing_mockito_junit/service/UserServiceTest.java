package com.example.testing_mockito_junit.service;

import com.example.testing_mockito_junit.dao.UserDaoImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.testing_mockito_junit.constain.UsersConstants.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserDaoImpl userDaoMock;

    @InjectMocks
    private UserService out;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void ShouldFindCorrectNameWhenGetUserByName() {
        when(userDaoMock.getUserByName(ARTEM.getName())).thenReturn(ARTEM);
        assertTrue(out.checkUserExist(ARTEM));
        verify(userDaoMock, times(1)).getUserByName(ARTEM.getName());
    }

    @Test
    public void ShouldNotFindWrongNameWhenGetUserByName() {
        when(userDaoMock.getUserByName(MONIKA.getName())).thenReturn(null);
        assertFalse(out.checkUserExist(MONIKA));
        verify(userDaoMock, times(1)).getUserByName(MONIKA.getName());
    }

}
