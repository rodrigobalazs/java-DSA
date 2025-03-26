package com.rbalazs;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
     * Sort the string given as parameter by it´s natural order ( e.g "waf" will return "afw" )
     */
    private static String sortStringViaArrays(final String string){
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private static String sortStringViaCollections(final String string){
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
}