package com.rbalazs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StreamExamplesTest {

    @Test
    public void filterWordsBySubstring() {

        List<String> words = Arrays.asList("root", "house", "avocado", "rest", "music", "average");
        String substringToFilter = "av";
        List<String> filteredWords = StreamExamples.filterWordsBySubstring(words, substringToFilter);
        assertEquals(Arrays.asList("average", "avocado"), filteredWords);
    }

    @Test
    public void filterWordsBySubstring_null() {
        List<String> filteredWords = StreamExamples.filterWordsBySubstring(null, null);
        assertEquals(Collections.emptyList(), filteredWords);
    }

    @Test
    public void filterWordsBySubstring_emptyList() {
        List<String> filteredWords = StreamExamples.filterWordsBySubstring(Collections.emptyList(),"");
        assertEquals(Collections.emptyList(), filteredWords);
    }
    
    @Test
    public void removeDuplicates() {
        List<String> words = Arrays.asList("hello", "world", "hello", "java", "world");
        List<String> wordsWithoutDuplicates = StreamExamples.removeDuplicates(words);
        assertEquals(Arrays.asList("hello", "world", "java"), wordsWithoutDuplicates);
    }

    @Test
    public void removeDuplicates_null() {
        List<String> wordsWithoutDuplicates = StreamExamples.removeDuplicates(null);
        assertEquals(Collections.emptyList(), wordsWithoutDuplicates);
    }

    @Test
    public void removeDuplicates_emptyList() {
        List<String> wordsWithoutDuplicates = StreamExamples.removeDuplicates(Collections.emptyList());
        assertEquals(Collections.emptyList(), wordsWithoutDuplicates);
    }

    @Test
    public void squareNumbers() {
        List<Integer> numbers = Arrays.asList(4,9,15,2);
        List<Integer> squaredNumbers = StreamExamples.squareNumbers(numbers);
        assertEquals(Arrays.asList(16,81,225,4), squaredNumbers);
    }

    @Test
    public void squareNumbers_null() {
        List<Integer> squaredNumbers = StreamExamples.squareNumbers(null);
        assertEquals(Collections.emptyList(), squaredNumbers);
    }

    @Test
    public void squareNumbers_emptyList() {
        List<Integer> squaredNumbers = StreamExamples.squareNumbers(Collections.emptyList());
        assertEquals(Collections.emptyList(), squaredNumbers);
    }
}
