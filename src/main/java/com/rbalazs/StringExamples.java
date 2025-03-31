package com.rbalazs;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * Some examples of DSA(Data Structure and Algorithms) over Strings.
 *
 * @author Rodrigo Balazs
 */
public class StringExamples {

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
     * Checks whether the string given as parameter it´s a palindrome or not ( e.g "level" it´s a palindrome word ).
     */
    public static boolean isPalindrome(final String stringToCheck) {
        if (StringUtils.isBlank(stringToCheck)) {
            return false;
        }
        String stringReversed = new StringBuilder(stringToCheck).reverse().toString();
        return stringToCheck.equals(stringReversed);
    }

    /**
     * Reverse the string given as parameter ( e.g "hello" will return "olleh" ) using a Stack as Data Structure.
     */
    public static String reverseStringUsingStack(final String string){
        if (StringUtils.isEmpty(string)){
            return "";
        }

        Stack<Character> stack = new Stack<>();
        for (char ch: string.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    /**
     * Checks whether a given string contains balanced parentheses or not using Stack as Data Structure
     * balanced means "Every opening parenthesis ( has a corresponding closing parenthesis )"
     *
     * -could be also solved using a LinkedList ( O(1) for adding/removing comparing with ArrayList ) instead a Stack
     *
     * e.g
     * "()()"   => true
     * "((()))" => true
     * "(()"    => false
     */
    public static boolean areParenthesesBalancedUsingStack(final String string){
        if (StringUtils.isEmpty(string)){
            return false;
        }

        //  Stack of '('
        Stack<Character> leftParenthesesStack = new Stack<>();
        for (char c : string.toCharArray()) {
            if(c == '('){
                leftParenthesesStack.push(c);        // leftParenthesesLinkedList.add(c);
            } else if(c == ')'){
                if (leftParenthesesStack.isEmpty()){
                    return false;
                }
                // found a pair of '()' therefore removes an element from the Stack
                leftParenthesesStack.pop();          // leftParenthesesLinkedList.remove(leftParenthesesLinkedList.size() - 1);
            }
        }

        // in case the parenthesis are balanced, at this point of execution the Stack should be empty
        return leftParenthesesStack.isEmpty();
    }
}