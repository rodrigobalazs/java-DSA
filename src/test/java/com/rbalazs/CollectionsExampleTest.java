package com.rbalazs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsExampleTest {

    @Test
    public void filterWordsBySubstring() {

        List<String> words = Arrays.asList("root", "house", "avocado", "rest", "music", "average");
        String substringToFilter = "av";
        List<String> filteredWords = CollectionsExample.filterWordsBySubstring(words, substringToFilter);
        assertEquals(Arrays.asList("average", "avocado"), filteredWords);
    }

    @Test
    public void filterWordsBySubstring_null() {
        List<String> filteredWords = CollectionsExample.filterWordsBySubstring(null, null);
        assertEquals(Collections.emptyList(), filteredWords);
    }

    @Test
    public void filterWordsBySubstring_emptyList() {
        List<String> filteredWords = CollectionsExample.filterWordsBySubstring(Collections.emptyList(),"");
        assertEquals(Collections.emptyList(), filteredWords);
    }

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
    public void mostFrequentInteger_emptyList() {
        int mostFrequentInteger = CollectionsExample.mostFrequentInteger(Collections.emptyList());
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

    @Test
    public void removeDuplicates() {
        List<String> words = Arrays.asList("hello", "world", "hello", "java", "world");
        List<String> wordsWithoutDuplicates = CollectionsExample.removeDuplicates(words);
        assertEquals(Arrays.asList("hello", "world", "java"), wordsWithoutDuplicates);
    }

    @Test
    public void removeDuplicates_null() {
        List<String> wordsWithoutDuplicates = CollectionsExample.removeDuplicates(null);
        assertEquals(Collections.emptyList(), wordsWithoutDuplicates);
    }

    @Test
    public void removeDuplicates_emptyList() {
        List<String> wordsWithoutDuplicates = CollectionsExample.removeDuplicates(Collections.emptyList());
        assertEquals(Collections.emptyList(), wordsWithoutDuplicates);
    }

    @Test
    public void squareNumbers() {
        List<Integer> numbers = Arrays.asList(4,9,15,2);
        List<Integer> squaredNumbers = CollectionsExample.squareNumbers(numbers);
        assertEquals(Arrays.asList(16,81,225,4), squaredNumbers);
    }

    @Test
    public void squareNumbers_null() {
        List<Integer> squaredNumbers = CollectionsExample.squareNumbers(null);
        assertEquals(Collections.emptyList(), squaredNumbers);
    }

    @Test
    public void squareNumbers_emptyList() {
        List<Integer> squaredNumbers = CollectionsExample.squareNumbers(Collections.emptyList());
        assertEquals(Collections.emptyList(), squaredNumbers);
    }
}
