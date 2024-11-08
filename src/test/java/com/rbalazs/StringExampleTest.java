package com.rbalazs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringExampleTest {

    @Test
    public void isPalindrome() {
        boolean result = StringExample.isPalindrome("kayak");
        assertTrue(result);
    }

    @Test
    public void isPalindrome_validateNull() {
        boolean result = StringExample.isPalindrome(null);
        assertFalse(result);
    }

    @Test
    public void isPalindrome_validateEmptyString() {
        boolean result = StringExample.isPalindrome("");
        assertFalse(result);
    }
}
