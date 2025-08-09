package com.rbalazs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void isPalindrome() {
        assertTrue(StringExamples.isPalindrome("kayak"));
    }

    @Test
    public void isPalindrome_stackImplementation() {
        assertTrue(StringExamples.isPalindrome_stackImplementation("kayak"));
    }

    @Test
    public void areParenthesesBalancedUsingStack(){
        assertTrue(StringExamples.areParenthesesBalancedUsingStack("()()"));
    }

    @Test
    public void areParenthesesBalancedUsingStack_notBalanced(){
        assertFalse(StringExamples.areParenthesesBalancedUsingStack("(((())"));
    }

    @Test
    public void retrievesConsecutiveChars(){
        List<StringExamples.ConsecutiveChar> consecutiveChars;
        consecutiveChars = StringExamples.retrievesConsecutiveChars("aaaabbbcca");

        assertEquals(4, consecutiveChars.size());

        assertEquals('a', consecutiveChars.get(0).getCharacter());
        assertEquals(4, consecutiveChars.get(0).getCount());

        assertEquals('b', consecutiveChars.get(1).getCharacter());
        assertEquals(3, consecutiveChars.get(1).getCount());

        assertEquals('c', consecutiveChars.get(2).getCharacter());
        assertEquals(2, consecutiveChars.get(2).getCount());

        assertEquals('a', consecutiveChars.get(3).getCharacter());
        assertEquals(1, consecutiveChars.get(3).getCount());
    }
}
