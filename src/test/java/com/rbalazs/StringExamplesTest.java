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
}
