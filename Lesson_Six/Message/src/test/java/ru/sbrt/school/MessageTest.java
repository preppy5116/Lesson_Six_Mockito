package ru.sbrt.school;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {
    @Mock
    Message  myMessage;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void given_whenGetMessage_thenStringMessage() {
        Mockito.when(myMessage.getMessage()).thenReturn("Message");
        assertEquals("Message", myMessage.getMessage());
    }
}