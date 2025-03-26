package com.rbalazs;

import org.apache.commons.lang3.StringUtils;

import java.util.Stack;

/**
 * Some examples of DSA over misc Data Structures (Stack,etc)
 *
 * @author Rodrigo Balazs
 */
public class DataStructureExamples {

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
}
