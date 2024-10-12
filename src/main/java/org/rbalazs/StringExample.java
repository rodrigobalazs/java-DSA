package org.rbalazs;

import org.apache.commons.lang3.Validate;

/**
 * Some examples of DSA(Data Structure and Algorithms),etc over Strings.
 *
 * @author Rodrigo Balazs
 */
public class StringExample {

    /**
     * Checks whether the string given as parameter it´s a palindrome or not.
     *
     * @param stringToCheck the string to check
     * @return true if it´s a palindrome, false otherwise.
     */
    public boolean isPalindrome(final String stringToCheck) {
        Validate.notNull(stringToCheck, "stringToCheck cannot be null");
        String stringReversed = new StringBuilder(stringToCheck).reverse().toString();
        return stringToCheck.equals(stringReversed);
    }
}