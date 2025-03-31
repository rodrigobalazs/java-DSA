package com.rbalazs;

import org.apache.commons.lang3.ArrayUtils;
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
     * Sort the string given as parameter by it´s natural order ( e.g "waf" will return "afw" ), the Sorting
     * implementation is made via Arrays.sort()
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
     * Sort the string given as parameter by it´s natural order ( e.g "waf" will return "afw" ), the Sorting
     * implementation is made via Collections.sort()
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
     * Checks whether the 2 strings given as parameters are Anagrams or not ( e.g "listen" and "silent" are anagrams )
     * using 2 Maps as Data Structure to solve it.
     */
    public static boolean areAnagramsUsingMaps(final String string1, final String string2) {

        if (StringUtils.isEmpty(string1) || StringUtils.isEmpty(string2)) {
            return false;
        }

        // <Character, numberOfOccurrences>
        Map<Character, Integer> string1CharsFrequencyMap = retrieveCharsFrequencyMap(string1);
        Map<Character, Integer> string2CharsFrequencyMap = retrieveCharsFrequencyMap(string2);
        return string1CharsFrequencyMap.equals(string2CharsFrequencyMap);
    }

    /**
     * Retrieves a Map with the frequency of each character for the string given as parameter.
     */
    private static Map<Character, Integer> retrieveCharsFrequencyMap(final String string) {

        Map<Character, Integer> charsFrequencyMap = new HashMap<>();
        for (char c : string.toCharArray()) {
            if (charsFrequencyMap.get(c) == null) {
                charsFrequencyMap.put(c, 1);
            } else {
                int charFrequency = charsFrequencyMap.get(c) + 1;
                charsFrequencyMap.put(c, charFrequency);
            }
        }
        return charsFrequencyMap;
    }

    /**
     * Retrieves for the 'array of integers' given as parameter and a given 'target' number, an array with the indexes
     * of the 2 numbers which add up to target
     *
     * e.g: twoSum([4,1,2],6) => [0,2]
     * implementation: brute-force solution using nested-loops | time complexity O(n*m)
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

    /**
     * Retrieves for the 'array of integers' given as parameter and a 'target' number, the position of 'target'
     * into the array ( if present )
     *
     * implementation: linear search ( for loop ) | time complexity O(n)
     * e.g: retrievePositionInArray([4,1,2,9,5],9) => 3
     */
    public static int retrievePositionInArray(final int[] numbers, final int target) {
        if(ArrayUtils.isEmpty(numbers)){
            return -1;
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == target){
                return i;
            }
        }
        return -1;
    }

    /**
     * Retrieves for the 'array of integers' given as parameter and a 'target' number, the position of 'target'
     * into the array ( if present )
     * implementation: binary search ( 'numbers' array needs to be Ordered ) | time complexity O(log n)
     *
     * e.g: retrievePositionInArrayUsingBinarySearch([1,2,4,5,9],9) => 4
     */
    public static int retrievePositionInArrayUsingBinarySearch(final int[] numbers, final int target) {
        if(ArrayUtils.isEmpty(numbers)){
            return -1;
        }
        int position = Arrays.binarySearch(numbers, target);
        if(position >= 0){
            return position;
        } else {
            return -1;
        }
    }
}