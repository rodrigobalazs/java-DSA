package com.rbalazs;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Some examples of DSA(Data Structure and Algorithms) over Collections(List,Set,etc) using Streams / Lambda Expressions.
 */
public class StreamExamples {

    /**
     * Retrieves a sorted list filtered only with the words that contains the substring given as parameter.
     * e.g => ["root", "house", "avocado", "rest", "music", "average"] and substringToFilter = "av"
     *        will return ["avocado", "average"]
     *
     * @param words the list of words
     * @param substringToFilter the substring to filter
     * @return a sorted list filtered with the words that contains the given substring.
     *         If the input list is empty, an empty immutable list will be returned.
     *         If the substringToFilter is empty, an empty immutable list will be returned.
     */
    public static List<String> filterWordsBySubstring(final List<String> words, final String substringToFilter) {

        if(CollectionUtils.isEmpty(words)) {
            return Collections.emptyList();
        }

        if(StringUtils.isEmpty(substringToFilter)) {
            return Collections.emptyList();
        }

        return words.stream()
                .filter(word -> word.contains(substringToFilter))
                .sorted()
                .collect(Collectors.toList());
    }


    /**
     * Retrieves the first word in the given list that starts with the prefix given as parameter.
     *
     * @param words the list of words to be searched
     * @param prefixToFind the prefix to search
     * @return a string containing the first word that starts with the prefix.
     *         If no word is found, an empty string will be returned.
     *         If the input list is empty, an empty string will be returned.
     *         If the prefixToFind is empty, an empty string will be returned.
     */
    public static String findFirstWordStartingWith(final List<String> words, final String prefixToFind) {

        if(CollectionUtils.isEmpty(words)) {
            return "";
        }

        if(StringUtils.isEmpty(prefixToFind)) {
            return "";
        }

        return words.stream()
                .filter(name -> name.startsWith(prefixToFind))
                .findFirst()
                .map(firstWordStartsWithPrefix -> String.format("The first word starting with the prefix:%s is:%s",
                        prefixToFind, firstWordStartsWithPrefix))
                .orElse(String.format("There is no word that starts with the prefix:%s", prefixToFind));
    }

    /**
     * Retrieves a list without duplicates words for the list of words given as parameter.
     * e.g => ["hello", "world", "hello", "java", "world"] will return ["hello", "world", "java"]
     *
     * @param words the list of words
     * @return a list without duplicates words.
     *         If the input list is empty, an empty immutable list will be returned.
     *
     */
    public static List<String> removeDuplicates(final List<String> words) {

        if(CollectionUtils.isEmpty(words)) {
            return Collections.emptyList();
        }

        return words.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * Retrieves a list with the squared values for the list of numbers given as parameter
     * e.g => [4,9,15,2] will return [16,81,225,4]
     *
     * @param numbers the list of numbers
     * @return a list of numbers where each element is the square of the corresponding element from the input list.
     *         If the input list is empty, an empty immutable list will be returned.
     */
    public static List<Integer> squareNumbers(final List<Integer> numbers) {

        if (CollectionUtils.isEmpty(numbers)) {
            return Collections.emptyList();
        }

        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
}