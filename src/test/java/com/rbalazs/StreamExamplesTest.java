package com.rbalazs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StreamExamplesTest {

    @Test
    public void filterWordsBySubstring() {
        List<String> wordsList = Arrays.asList("root", "house", "avocado", "rest", "music", "average");
        List<String> expectedWordsList = Arrays.asList("average", "avocado");
        assertEquals(expectedWordsList, StreamExamples.filterWordsBySubstring(wordsList, "av"));
    }

    @Test
    public void filterWordsBySubstring_null() {
        assertEquals(Collections.emptyList(), StreamExamples.filterWordsBySubstring(null, null));
    }

    @Test
    public void filterWordsBySubstring_emptyList() {
        assertEquals(Collections.emptyList(), StreamExamples.filterWordsBySubstring(Collections.emptyList(),""));
    }

    @Test
    public void findFirstWordStartingWith() {
        List<String> wordsList = Arrays.asList("root", "house", "avocado", "rest", "music", "average");
        assertEquals("The first word starting with the prefix:re is:rest",
                StreamExamples.findFirstWordStartingWith(wordsList, "re"));
    }

    @Test
    public void findFirstWordStartingWith_noResults() {
        List<String> wordsList = Arrays.asList("root", "house", "avocado", "rest", "music", "average");
        assertEquals("There is no word that starts with the prefix:test",
                StreamExamples.findFirstWordStartingWith(wordsList, "test"));
    }

    @Test
    public void findFirstWordStartingWith_null() {
        assertEquals("", StreamExamples.findFirstWordStartingWith(null, null));
    }

    @Test
    public void findFirstWordStartingWith_emptyList() {
        String result = StreamExamples.findFirstWordStartingWith(Collections.emptyList(),"");
        assertEquals("", result);
    }
    
    @Test
    public void removeDuplicates() {
        List<String> wordsList = Arrays.asList("hello", "world", "hello", "java", "world");
        List<String> expectedWordsList = Arrays.asList("hello", "world", "java");
        assertEquals(expectedWordsList, StreamExamples.removeDuplicates(wordsList));
    }

    @Test
    public void removeDuplicates_null() {
        assertEquals(Collections.emptyList(), StreamExamples.removeDuplicates(null));
    }

    @Test
    public void removeDuplicates_emptyList() {
        assertEquals(Collections.emptyList(), StreamExamples.removeDuplicates(Collections.emptyList()));
    }

    @Test
    public void squareNumbers() {
        assertEquals(Arrays.asList(16,81,225,4), StreamExamples.squareNumbers(Arrays.asList(4,9,15,2)));
    }

    @Test
    public void squareNumbers_null() {
        assertEquals(Collections.emptyList(), StreamExamples.squareNumbers(null));
    }

    @Test
    public void squareNumbers_emptyList() {
        assertEquals(Collections.emptyList(), StreamExamples.squareNumbers(Collections.emptyList()));
    }
}
