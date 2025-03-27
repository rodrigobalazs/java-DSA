package com.rbalazs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackExamplesTest {

    @Test
    public void testReverseStringViaStack(){
        assertEquals("evif", StackExamples.reverseStringViaStack("five"));
    }

    @Test
    public void testReverseStringViaStack_emptyString(){
        assertEquals("", StackExamples.reverseStringViaStack(""));
    }

    @Test
    public void testAreParenthesesBalanced(){
        assertTrue(StackExamples.areParenthesesBalanced("()()"));
    }

    @Test
    public void testAreParenthesesBalanced2(){
        assertTrue(StackExamples.areParenthesesBalanced("((()))"));
    }

    @Test
    public void testAreParenthesesBalanced_notBalanced(){
        assertFalse(StackExamples.areParenthesesBalanced("(((())"));
    }
}

