package ru.sbrt.school;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorImpl implements Iterator<Object> {

    private int iterator = 0;
    private Object [] array;
    public IteratorImpl(Object [] myArray) {
        this.array = myArray;
    }

    /**
     * Метод проверяет есть ли следующий элемент массива
     * @return
     */
    @Override
    public boolean hasNext() {
        return iterator < array.length;
    }

    /**
     * Метод возвращает следующий элемент массива
     * @return Object
     */
    @Override
    public Object next() {
        if (iterator >= array.length) {
            throw new NoSuchElementException();
        }
        return array[iterator++];
    }
}
