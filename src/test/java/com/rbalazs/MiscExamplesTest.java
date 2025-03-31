package com.rbalazs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MiscExamplesTest {

    @Test
    public void areAnagrams(){
        assertTrue(MiscExamples.areAnagrams("listen","silent"));
    }

    @Test
    public void areAnagrams_notAnagrams(){
        assertFalse(MiscExamples.areAnagrams("listen","sinatnl"));
    }

    @Test
    public void areAnagrams_notAnagrams_differentLength(){
        assertFalse(MiscExamples.areAnagrams("wooo","ow"));
    }

    @Test
    public void areAnagrams_notAnagrams_emptyString(){
        assertFalse(MiscExamples.areAnagrams("",""));
    }

    @Test
    public void areAnagramsUsingMaps(){
        assertTrue(MiscExamples.areAnagramsUsingMaps("listen","silent"));
    }

    @Test
    public void areAnagramsUsingMaps_notAnagrams(){
        assertFalse(MiscExamples.areAnagramsUsingMaps("listen","sinatnl"));
    }

    @Test
    public void twoSum(){
        int[] numbers = {4,1,2};
        int target = 6;
        int[] expected = {0,2};
        assertArrayEquals(expected, MiscExamples.twoSum(numbers, target));
    }

    @Test
    public void retrievePositionInArray(){
        int[] numbers = {4,1,2,50,9,3};
        int target = 9;
        int expectedPosition = 4;
        assertEquals(expectedPosition, MiscExamples.retrievePositionInArray(numbers, target));
    }

    @Test
    public void retrievePositionInArray_targetNotFound(){
        int[] numbers = {4,1,2,50,9,3};
        int target = 100;
        int expectedPosition = -1;
        assertEquals(expectedPosition, MiscExamples.retrievePositionInArray(numbers, target));
    }

    @Test
    public void retrievePositionInArray_nullArray(){
        int target = 9;
        int expectedPosition = -1;
        assertEquals(expectedPosition, MiscExamples.retrievePositionInArray(null, target));
    }

    @Test
    public void retrievePositionInArrayUsingBinarySearch(){
        int[] numbers = {1,2,3,4,9,50};
        int target = 9;
        int expectedPosition = 4;
        assertEquals(expectedPosition, MiscExamples.retrievePositionInArrayUsingBinarySearch(numbers, target));
    }

    @Test
    public void retrievePositionInArrayUsingBinarySearch_targetNotFound(){
        int[] numbers = {1,2,3,4,9,50};
        int target = 900;
        int expectedPosition = -1;
        assertEquals(expectedPosition, MiscExamples.retrievePositionInArrayUsingBinarySearch(numbers, target));
    }
}
