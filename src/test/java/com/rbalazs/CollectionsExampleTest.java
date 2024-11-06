package com.rbalazs;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsExampleTest {

    @Test
    public void mostFrequentInteger() {
        List<Integer> integers = Arrays.asList(4, 9, 3, 2, 2, 2, 1, 5);
        int mostFrequentInteger = CollectionsExample.mostFrequentInteger(integers);
        assertEquals(2, mostFrequentInteger);
    }

    @Test
    public void mostFrequentInteger_null() {
        int mostFrequentInteger = CollectionsExample.mostFrequentInteger(null);
        assertEquals(-1, mostFrequentInteger);
    }

    @Test
    public void mostFrequentInteger_empty() {
        int mostFrequentInteger = CollectionsExample.mostFrequentInteger(new LinkedList<>());
        assertEquals(-1, mostFrequentInteger);
    }

    @Test
    public void mostFrequentElement_charType() {
        List<Character> characters = Arrays.asList('a', 'c', 'c', 'c', 'd', 'f', 'd');
        Character mostFrequentCharacter = CollectionsExample.mostFrequentElement(characters);
        assertEquals('c', mostFrequentCharacter);
    }

    @Test
    public void mostFrequentElement_longType() {
        List<Long> longs = Arrays.asList(4L, 311L, 5L, 5L, 1L, 1114L, 5L, 5L, 4L);
        Long mostFrequentLong = CollectionsExample.mostFrequentElement(longs);
        assertEquals(5L, mostFrequentLong);
    }

    @Test
    public void mostFrequentElement_null() {
        Object mostFrequentElement = CollectionsExample.mostFrequentElement(null);
        assertEquals(null, mostFrequentElement);
    }
}
