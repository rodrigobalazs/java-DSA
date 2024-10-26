package org.rbalazs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * StringExample Test
 *
 * @author Rodrigo Balazs
 */
public class StringExampleTest {

    @Test
    public void isPalindrome() {
        boolean result = StringExample.isPalindrome("kayak");
        assertTrue(result);
    }

    @Test
    public void isNotPalindrome() {
        boolean result = StringExample.isPalindrome("plugin");
        assertFalse(result);
    }

    @Test
    public void isNotPalindrome_validateNull() {
        boolean result = StringExample.isPalindrome(null);
        assertFalse(result);
    }

    @Test
    public void isNotPalindrome_validateEmptyString() {
        boolean result = StringExample.isPalindrome("");
        assertFalse(result);
    }
}
