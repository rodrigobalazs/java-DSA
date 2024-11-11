package com.rbalazs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionExamplesTest {

    @Test
    public void mostFrequentInteger() {
        List<Integer> integers = Arrays.asList(4, 9, 3, 2, 2, 2, 1, 5);
        int mostFrequentInteger = CollectionExamples.mostFrequentInteger(integers);
        assertEquals(2, mostFrequentInteger);
    }

    @Test
    public void mostFrequentInteger_null() {
        int mostFrequentInteger = CollectionExamples.mostFrequentInteger(null);
        assertEquals(-1, mostFrequentInteger);
    }

    @Test
    public void mostFrequentInteger_emptyList() {
        int mostFrequentInteger = CollectionExamples.mostFrequentInteger(Collections.emptyList());
        assertEquals(-1, mostFrequentInteger);
    }

    @Test
    public void mostFrequentElement_charType() {
        List<Character> characters = Arrays.asList('a', 'c', 'c', 'c', 'd', 'f', 'd');
        Character mostFrequentCharacter = CollectionExamples.mostFrequentElement(characters);
        assertEquals('c', mostFrequentCharacter);
    }

    @Test
    public void mostFrequentElement_longType() {
        List<Long> longs = Arrays.asList(4L, 311L, 5L, 5L, 1L, 1114L, 5L, 5L, 4L);
        Long mostFrequentLong = CollectionExamples.mostFrequentElement(longs);
        assertEquals(5L, mostFrequentLong);
    }

    @Test
    public void mostFrequentElement_null() {
        Object mostFrequentElement = CollectionExamples.mostFrequentElement(null);
        assertEquals(null, mostFrequentElement);
    }
}
