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

    @Test
    void givenUserID_whenGetFriendByNewID_thenArrayListOfFriends() {
        ArrayList<UserImpl> list = new ArrayList<>();
        list.add(new UserImpl(30));
        list.add(new UserImpl(20));

        Mockito.when(friendsBDList.getFriendsByID(new UserImpl(1).getUserID())).thenReturn(list);
        assertEquals(list, friendsBDList.getFriendsByID(new UserImpl(1).getUserID()));
    }

    @Test
    void givenUserID_whenGetFriendByID_thenFreeArrayList() {
        FriendsBD friendsBDList = Mockito.mock(FriendsBD.class);

        Mockito.when(friendsBDList.getFriendsByNewID(new UserImpl(1).getUserID())).thenReturn(new ArrayList<>());
        assertEquals(friendsBDList.getFriendsByNewID(new UserImpl(1).getUserID()), new ArrayList<UserImpl>());
    }
}