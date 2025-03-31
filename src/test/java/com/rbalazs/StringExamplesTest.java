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
    public void areAnagrams_notAnagrams_differentLength(){
        assertFalse(StringExamples.areAnagrams("wooo","ow"));
    }

    @Test
    public void areAnagrams_notAnagrams_emptyString(){
        assertFalse(StringExamples.areAnagrams("",""));
    }

    @Test
    public void areAnagramsUsingMaps(){
        assertTrue(StringExamples.areAnagramsUsingMaps("listen","silent"));
    }

    @Test
    public void areAnagramsUsingMaps_notAnagrams(){
        assertFalse(StringExamples.areAnagramsUsingMaps("listen","sinatnl"));
    }

    @Test
    public void isPalindrome() {
        assertTrue(StringExamples.isPalindrome("kayak"));
    }

    @Test
    public void isPalindrome_validateNull() {
        assertFalse(StringExamples.isPalindrome(null));
    }

    @Test
    public void isPalindrome_validateEmptyString() {
        assertFalse(StringExamples.isPalindrome(""));
    }

    @Test
    public void reverseStringUsingStack(){
        assertEquals("evif", StringExamples.reverseStringUsingStack("five"));
    }

    @Test
    public void reverseStringUsingStack_emptyString(){
        assertEquals("", StringExamples.reverseStringUsingStack(""));
    }

    @Test
    public void areParenthesesBalancedUsingStack(){
        assertTrue(StringExamples.areParenthesesBalancedUsingStack("()()"));
    }

    @Test
    public void areParenthesesBalanced2(){
        assertTrue(StringExamples.areParenthesesBalancedUsingStack("((()))"));
    }

    @Test
    public void areParenthesesBalanced_notBalanced(){
        assertFalse(StringExamples.areParenthesesBalancedUsingStack("(((())"));
    }
}
