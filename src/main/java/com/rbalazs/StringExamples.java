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

        String orderedString1 = sortString(string1);
        String orderedString2 = sortString(string2);
        return orderedString1.equals(orderedString2);
    }

    /**
     * Sort the string given as parameter by it´s natural order ( e.g "waf" will return "afw" ) using Arrays.sort()
     */
    private static String sortString(final String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    /**
     * Retrieves a Map with the number of ocurrences of each character for the string given as parameter.
     */
    private static Map<Character, Integer> retrieveCharsNumberOfOccurrencesMap(final String string) {

        Map<Character, Integer> charsNumberOfOcurrencesMap = new HashMap<>();
        for (char c : string.toCharArray()) {
            if (charsNumberOfOcurrencesMap.get(c) == null) {
                charsNumberOfOcurrencesMap.put(c, 1);
            } else {
                int charNumberOcurrences = charsNumberOfOcurrencesMap.get(c) + 1;
                charsNumberOfOcurrencesMap.put(c, charNumberOcurrences);
            }
        }
        return charsNumberOfOcurrencesMap;
    }

    /**
     * Checks whether the string given as parameter it´s a palindrome or not ( e.g "level" it´s a palindrome word ).
     */
    public static boolean isPalindrome(final String word) {
        if (StringUtils.isEmpty(word)) {
            return false;
        }
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }

    /**
     * Checks whether the string given as parameter it´s a palindrome or not ( e.g "level" it´s a palindrome word )
     * using a 'Stack'.
     */
    public static boolean isPalindrome_stackImplementation(final String word) {
        if (StringUtils.isEmpty(word)) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char[] chars = word.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        String reversedWord = stringBuilder.toString();
        return word.equals(reversedWord);
    }

    /**
     * Checks whether a given string contains balanced parentheses or not using a Stack
     * - balanced parentheses => Every opening parenthesis has a corresponding closing parenthesis
     * - could be also solved using a LinkedList ( O(1) for adding/removing comparing with ArrayList ) instead a Stack
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
                // found a pair of '()' therefore removes a '(' from the Stack
                leftParenthesesStack.pop();          // leftParenthesesLinkedList.remove(leftParenthesesLinkedList.size() - 1);
            }
        }

        // in case the parenthesis are balanced, at this point of execution the Stack should be empty
        return leftParenthesesStack.isEmpty();
    }

    /**
     * Retrieves a list of consecutive characters associated to the String given as parameter.
     * e.g "aaaabbbcca" will return [('a',4),('b',3),('c',2),('a',1)]
     */
    public static List<ConsecutiveChar> retrievesConsecutiveChars(final String string) {
        List<ConsecutiveChar> consecutiveChars = new ArrayList<>();

        char[] chars = string.toCharArray();
        char currentChar = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (currentChar == chars[i]) {
                count++;
            } else {
                consecutiveChars.add(new ConsecutiveChar(currentChar, count));
                currentChar = chars[i];
                count = 1;
            }
        }

        consecutiveChars.add(new ConsecutiveChar(currentChar, count));
        return consecutiveChars;
    }

    static class ConsecutiveChar {
        char character;
        int count;

        ConsecutiveChar(final char character, final int count) {
            this.character = character;
            this.count = count;
        }

        public int getCharacter(){
            return this.character;
        }

        public int getCount(){
            return this.count;
        }
    }
}
