package ru.sbrt.school;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class FriendsBDTest {
    @Mock
    FriendsBD friendsBDList;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @org.junit.jupiter.api.Test
    void getFriendsByID() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(30));
        list.add(new User(20));

        Mockito.when(friendsBDList.getFriendsByNewID(new User(1).getUserID())).thenReturn(list);
        assertEquals(list, friendsBDList.getFriendsByNewID(new User(1).getUserID()));
    }

    @Test
    void getFriendList() {
        FriendsBD friendsBDList = Mockito.mock(FriendsBD.class);

        Mockito.when(friendsBDList.getFriendsByID(new User(1).getUserID())).thenReturn(new ArrayList<>());
        assertEquals(friendsBDList.getFriendsByID(new User(1).getUserID()), new ArrayList<User>());
    }
}