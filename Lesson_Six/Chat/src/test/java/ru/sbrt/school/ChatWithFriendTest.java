package ru.sbrt.school;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChatWithFriendTest {
    @Mock
    ChatWithFriend chat;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void given_UserIDFriendID_whenGetDialogWithFriend_thenReturnMessage() {
        //given
        MessageCreator message = new MessageCreator();
        message.setMessage("Сообщение");
        //when
        Mockito.when(chat.getDialogWithFriend(new UserImpl(1).getUserID(), new UserImpl(2).getUserID()))
                .thenReturn(Optional.of(message));
        Optional<MessageCreator> dialogWithFriend = chat.getDialogWithFriend(1,2);
        //then
        assertTrue(dialogWithFriend.isPresent());
        assertEquals("Сообщение", dialogWithFriend.get().getMessage());
    }
}