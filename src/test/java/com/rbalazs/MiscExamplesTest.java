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
        int[] numbersArray = {4,1,2};
        int target = 6;
        int[] expectedArray = {0,2};
        assertArrayEquals(expectedArray, MiscExamples.twoSum(numbersArray, target));
    }

    @Test
    public void retrievePositionInArray(){
        int[] numbersArray = {4,1,2,50,9,3};
        int target = 9;
        int expectedPosition = 4;
        assertEquals(expectedPosition, MiscExamples.retrievePositionInArray(numbersArray, target));
    }

    @Test
    public void retrievePositionInArray_targetNotFound(){
        int[] numbersArray = {4,1,2,50,9,3};
        int target = 100;
        int expectedPosition = -1;
        assertEquals(expectedPosition, MiscExamples.retrievePositionInArray(numbersArray, target));
    }

    @Test
    public void retrievePositionInArray_nullArray(){
        assertEquals(-1, MiscExamples.retrievePositionInArray(null, 9));
    }

    @Test
    public void retrievePositionInArrayUsingBinarySearch(){
        int[] numbersArray = {1,2,3,4,9,50};
        int target = 9;
        int expectedPosition = 4;
        assertEquals(expectedPosition, MiscExamples.retrievePositionInArrayUsingBinarySearch(numbersArray, target));
    }

    @Test
    public void retrievePositionInArrayUsingBinarySearch_targetNotFound(){
        int[] numbersArray = {1,2,3,4,9,50};
        int target = 900;
        int expectedPosition = -1;
        assertEquals(expectedPosition, MiscExamples.retrievePositionInArrayUsingBinarySearch(numbersArray, target));
    }
}
