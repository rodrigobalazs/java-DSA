package com.rbalazs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringExamplesTest {

    @Test
    public void areAnagrams(){
        assertTrue(StringExamples.areAnagrams("listen","silent"));
    }

    @Test
    public void areAnagrams_notAnagrams(){
        assertFalse(StringExamples.areAnagrams("listen","sinatnl"));
    }

    @Test
    public void areAnagramsUsingMaps(){
        assertTrue(StringExamples.areAnagramsUsingMaps("listen","silent"));
    }

    @Test
    public void isPalindrome() {
        assertTrue(StringExamples.isPalindrome("kayak"));
    }

    @Test
    public void reverseStringUsingStack(){
        assertEquals("evif", StringExamples.reverseStringUsingStack("five"));
    }

    @Test
    public void areParenthesesBalancedUsingStack(){
        assertTrue(StringExamples.areParenthesesBalancedUsingStack("()()"));
    }

    @Test
    public void areParenthesesBalancedUsingStack_notBalanced(){
        assertFalse(StringExamples.areParenthesesBalancedUsingStack("(((())"));
    }
}
