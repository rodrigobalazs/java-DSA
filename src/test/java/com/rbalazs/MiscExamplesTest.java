package com.rbalazs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MiscExamplesTest {

    @Test
    public void testAreAnagrams(){
        assertTrue(MiscExamples.areAnagrams("listen","silent"));
    }

    @Test
    public void testAreAnagrams_notAnagrams(){
        assertFalse(MiscExamples.areAnagrams("listen","sinatnl"));
    }

    @Test
    public void testAreAnagrams_notAnagrams_differentLength(){
        assertFalse(MiscExamples.areAnagrams("wooo","ow"));
    }

    @Test
    public void testAreAnagrams_notAnagrams_emptyString(){
        assertFalse(MiscExamples.areAnagrams("",""));
    }

    @Test
    public void testTwoSum(){
        int[] numbers = {4,1,2};
        int target = 6;
        int[] expected = {0,2};
        assertArrayEquals(expected, MiscExamples.twoSum(numbers, target));
    }

}
