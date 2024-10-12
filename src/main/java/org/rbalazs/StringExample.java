package org.rbalazs;

public class StringExample {

    public boolean isPalindrome(final String stringToCheck) {
        if (stringToCheck == null) {
            return false;
        }
        String stringReversed = new StringBuilder(stringToCheck).reverse().toString();
        return stringToCheck.equals(stringReversed);
    }
}

