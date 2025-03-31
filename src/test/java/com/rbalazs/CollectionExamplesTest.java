package com.rbalazs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionExamplesTest {

    @Test
    public void mostFrequentInteger() {
        List<Integer> integersList = Arrays.asList(4, 9, 3, 2, 2, 2, 1, 5);
        assertEquals(2, CollectionExamples.mostFrequentInteger(integersList));
    }

    @Test
    public void mostFrequentInteger_null() {
        assertEquals(-1, CollectionExamples.mostFrequentInteger(null));
    }

    @Test
    public void mostFrequentInteger_emptyList() {
        assertEquals(-1, CollectionExamples.mostFrequentInteger(Collections.emptyList()));
    }

    @Test
    public void mostFrequentElementViaGenerics_charType() {
        List<Character> charsList = Arrays.asList('a', 'c', 'c', 'c', 'd', 'f', 'd');
        assertEquals('c', CollectionExamples.mostFrequentElementViaGenerics(charsList));
    }

    @Test
    public void mostFrequentElementViaGenerics_longType() {
        List<Long> longsList = Arrays.asList(4L, 311L, 5L, 5L, 1L, 1114L, 5L, 5L, 4L);
        assertEquals(5L, CollectionExamples.mostFrequentElementViaGenerics(longsList));
    }

    @Test
    public void mostFrequentElementViaGenerics_null() {
        assertNull(CollectionExamples.mostFrequentElementViaGenerics(null));
    }

    @Test
    public void arrayHasDuplicates() {
        assertTrue(CollectionExamples.arrayHasDuplicates(new int[]{4,4,1,2}));
    }

    @Test
    public void arrayHasDuplicates_noDuplicates() {
        assertFalse(CollectionExamples.arrayHasDuplicates(new int[]{4,1,2}));
    }
}
