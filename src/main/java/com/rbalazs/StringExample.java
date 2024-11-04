package com.rbalazs;

import org.apache.commons.lang3.StringUtils;

/**
 * Some examples of DSA(Data Structure and Algorithms) over Strings.
 */
public class StringExample {

    /**
     * Checks whether the string given as parameter it´s a palindrome or not.
     *
     * @param stringToCheck the string to check.
     * @return true if it´s a palindrome, false otherwise.
     */
    public static boolean isPalindrome(final String stringToCheck) {
        if (StringUtils.isBlank(stringToCheck)) {
            return false;
        }
        String stringReversed = new StringBuilder(stringToCheck).reverse().toString();
        return stringToCheck.equals(stringReversed);
    }
}