package com.rbalazs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionExamplesTest {


    @Test
    public void filterWordsBySubstring() {
        List<String> wordsList = Arrays.asList("root", "house", "avocado", "rest", "music", "average");
        List<String> expectedWordsList = Arrays.asList("average", "avocado");
        assertEquals(expectedWordsList, CollectionExamples.filterWordsBySubstring(wordsList, "av"));
    }

    @Test
    public void filterWordsBySubstring_null() {
        assertEquals(Collections.emptyList(), CollectionExamples.filterWordsBySubstring(null, null));
    }

    @Test
    public void filterWordsBySubstring_emptyList() {
        assertEquals(Collections.emptyList(), CollectionExamples.filterWordsBySubstring(Collections.emptyList(),""));
    }

    @Test
    public void findFirstWordStartingWith() {
        List<String> wordsList = Arrays.asList("root", "house", "avocado", "rest", "music", "average");
        assertEquals("The first word starting with the prefix:re is:rest",
                CollectionExamples.findFirstWordStartingWith(wordsList, "re"));
    }

    @Test
    public void mostFrequentInteger() {
        List<Integer> integersList = Arrays.asList(4, 9, 3, 2, 2, 2, 1, 5);
        assertEquals(2, CollectionExamples.mostFrequentInteger(integersList));
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
    public void removeDuplicatesUsingStreams() {
        List<String> wordsList = Arrays.asList("hello", "world", "hello", "java", "world");
        List<String> expectedWordsList = Arrays.asList("hello", "world", "java");
        assertEquals(expectedWordsList, CollectionExamples.removeDuplicatesUsingStreams(wordsList));
    }

    @Test
    public void squareNumbers() {
        assertEquals(Arrays.asList(16,81,225,4), CollectionExamples.squareNumbers(Arrays.asList(4,9,15,2)));
    }
}
