package com.rbalazs;

import org.apache.commons.lang3.StringUtils;

/**
 * Some examples of DSA(Data Structure and Algorithms) over Strings.
 *
 * @author Rodrigo Balazs
 */
public class StringExamples {

    /**
     * Checks whether the string given as parameter it´s a palindrome or not ( e.g "level" it´s a palindrome word ).
     */
    public static boolean isPalindrome(final String stringToCheck) {
        if (StringUtils.isBlank(stringToCheck)) {
            return false;
        }
        String stringReversed = new StringBuilder(stringToCheck).reverse().toString();
        return stringToCheck.equals(stringReversed);
    }
}