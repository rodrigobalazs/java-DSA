package com.rbalazs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringExamplesTest {

    @Test
    public void isPalindrome() {
        boolean result = StringExamples.isPalindrome("kayak");
        assertTrue(result);
    }

    @Test
    public void isPalindrome_validateNull() {
        boolean result = StringExamples.isPalindrome(null);
        assertFalse(result);
    }

    @Test
    public void isPalindrome_validateEmptyString() {
        boolean result = StringExamples.isPalindrome("");
        assertFalse(result);
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
