package ru.sbrt.school;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Mock
    User myUser;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void givenUser_whenGetUserID_thenID () {
        Mockito.when(myUser.getUserID()).thenReturn(5);
        assertEquals(5, myUser.getUserID());
    }

}