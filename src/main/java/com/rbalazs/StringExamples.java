package com.rbalazs;

import org.apache.commons.lang3.StringUtils;

import java.util.Stack;

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