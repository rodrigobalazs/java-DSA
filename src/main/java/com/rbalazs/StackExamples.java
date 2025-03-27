package com.rbalazs;

import org.apache.commons.lang3.StringUtils;

import java.util.Stack;

/**
 * Some examples of DSA using Stack as Data Structure
 *
 * @author Rodrigo Balazs
 */
public class StackExamples {

    /**
     * Reverse the string given as parameter ( e.g "hello" will return "olleh" ) using a Stack as Data Structure.
     */
    public static String reverseStringViaStack(final String string){
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
     * e.g
     * "()()"   => true
     * "((()))" => true
     * "(()"    => false
     */
    public static boolean areParenthesesBalanced(final String string){
        if (StringUtils.isEmpty(string)){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if(c == '('){
                stack.push(c);
            } else if(c == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                // found a pair of '()' therefore removes a given '(' from the Stack
                stack.pop();
            }
        }

        // in case the parenthesis are balanced, at this point of execution the Stack should be empty
        return stack.isEmpty();
    }
}

