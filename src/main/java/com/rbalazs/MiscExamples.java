package com.rbalazs;

import org.apache.commons.lang3.StringUtils;
import java.util.*;

/**
 * Misc examples regarding DSA (Data Structure and Algorithms)
 *
 * @author Rodrigo Balazs
 */
public class MiscExamples {

    /**
     * Checks whether the 2 strings given as parameters are Anagrams or not ( e.g "listen" and "silent" are anagrams )
     */
    public static boolean areAnagrams(final String string1, final String string2) {

        if (StringUtils.isEmpty(string1) || StringUtils.isEmpty(string2)) {
            return false;
        }

        if (string1.length() != string2.length()) {
            return false;
        }

        String sortedString1 = sortStringViaArrays(string1);
        String sortedString2 = sortStringViaCollections(string2);
        if (sortedString1.equals(sortedString2)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sort the string given as parameter by it´s natural order ( e.g "waf" will return "afw" ) | Sorting implementation via Arrays.sort()
     */
    private static String sortStringViaArrays(final String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    /**
     * Sort the string given as parameter by it´s natural order ( e.g "waf" will return "afw" ) | Sorting implementation via Collections.sort()
     */
    private static String sortStringViaCollections(final String string) {
        List<Character> chars = new ArrayList<>();
        for (char c : string.toCharArray()) {
            chars.add(c);
        }

        Collections.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    /**
     * Retrieves for the 'array of integers' given as parameter and a given 'target' number, an array with the indexes
     * of the 2 numbers which add up to target
     *
     * e.g: twoSum([4,1,2],6) => [0,2]
     * implementation: brute-force solution using nested-loops | complexity O(n*m)
     */
    public static int[] twoSum(final int[] numbers, final int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}