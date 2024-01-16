package ru.sbrt.school;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class IteratorImplTest {

    String[] arrString = {"1", "afd", "2", "element2"};
    IteratorImpl iterator = new IteratorImpl(arrString);

    @Test
    void givenArrayObject_whenArrayHasNext_thenArrayNext() {
        int index = 0;
        while (iterator.hasNext()) {
            assertEquals(arrString[index++], iterator.next());
        }
        assertThrows(NoSuchElementException.class, iterator::next);
    }
}