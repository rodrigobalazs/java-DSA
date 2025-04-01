package com.rbalazs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayExamplesTest {

    @Test
    public void hasDuplicates() {
        int[] integersArray = {4,4,1,2};
        assertTrue(ArrayExamples.hasDuplicates(integersArray));
    }

    @Test
    public void hasDuplicates_noDuplicates() {
        int[] integersArray = {4,1,2};
        assertFalse(ArrayExamples.hasDuplicates(integersArray));
    }

    @Test
    public void twoSum(){
        int[] numbersArray = {4,1,2};
        int target = 6;
        int[] expectedArray = {0,2};
        assertArrayEquals(expectedArray, ArrayExamples.twoSum(numbersArray, target));
    }

    @Test
    public void removeDuplicatesNumbersUsingStreams() {
        int[] numbers = new int[]{4,9,4,4,1,2,2};
        int[] expectedNumbers = new int[]{4,9,1,2};
        assertArrayEquals(expectedNumbers, ArrayExamples.removeDuplicatesNumbersUsingStreams(numbers));
    }

    @Test
    public void removeDuplicatesNumbersUsingMap() {
        int[] numbers = new int[]{4,9,4,4,1,2,2};
        int[] expectedNumbers = new int[]{4,9,1,2};
        assertArrayEquals(expectedNumbers, ArrayExamples.removeDuplicatesNumbersUsingMap(numbers));
    }

    @Test
    public void retrievePositionInArray(){
        int[] numbersArray = {4,1,2,50,9,3};
        int target = 9;
        int expectedPosition = 4;
        assertEquals(expectedPosition, ArrayExamples.retrievePositionInArray(numbersArray, target));
    }

    @Test
    public void retrievePositionInArray_targetNotFound(){
        int[] numbersArray = {4,1,2,50,9,3};
        int target = 100;
        int expectedPosition = -1;
        assertEquals(expectedPosition, ArrayExamples.retrievePositionInArray(numbersArray, target));
    }

    @Test
    public void retrievePositionInArrayUsingBinarySearch(){
        int[] numbersArray = {1,2,3,4,9,50};
        int target = 9;
        int expectedPosition = 4;
        assertEquals(expectedPosition, ArrayExamples.retrievePositionInArrayUsingBinarySearch(numbersArray, target));
    }
}
