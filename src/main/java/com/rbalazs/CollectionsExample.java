package com.rbalazs;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Some examples of DSA(Data Structure and Algorithms) over Collections(List,Set,etc).
 */
public class CollectionsExample {

    /**
     * Retrieves the most frequent integer of a given list of integers.
     * e.g => [4, 9, 3, 2, 2, 2, 1, 5] the most frequent integer is 2
     *
     * @param integers the list of integers e.g [4, 9, 3, 2, 2, 2, 1, 5]
     * @return an integer which represent the most frequent number of a given list.
     *         -1 in case the input list is null or empty.
     */
    public static int mostFrequentInteger(final List<Integer> integers) {

        if (CollectionUtils.isEmpty(integers)) {
            return -1;
        }

        // < Number, numberOfOccurrences >
        Map<Integer, Integer> mostFrequentIntegers = new HashMap<>();
        for (Integer integer : integers) {
            Integer numberOfOccurrences = mostFrequentIntegers.get(integer);
            if (numberOfOccurrences == null) {
                mostFrequentIntegers.put(integer, 1);
            } else {
                mostFrequentIntegers.put(integer, numberOfOccurrences + 1);
            }
        }

        Integer highestNumberOfOccurrences = 0;
        Integer mostFrequentInteger = 0;

        for (Integer integer : mostFrequentIntegers.keySet()) {

            Integer numberOfOccurrences = mostFrequentIntegers.get(integer);
            if (numberOfOccurrences > highestNumberOfOccurrences) {
                highestNumberOfOccurrences = numberOfOccurrences;
                mostFrequentInteger = integer;
            }
        }
        return mostFrequentInteger;
    }

    /**
     * Retrieves the most frequent element of a given list of generic elements ( element type could be any
     * like Character, Integer, Long, etc ).
     * e.g => ['a', 'c', 'c', 'd'] the most frequent element is 'c'
     *
     * @param elements the list of generic elements e.g ['a', 'c', 'c', 'd']
     * @return a generic object/element which represent the most frequent element of a given list.
     *         Null in case the input list is null or empty.
     */
    public static <T> T mostFrequentElement(final List<T> elements) {

        if (CollectionUtils.isEmpty(elements)) {
            return null;
        }

        // < Element, occurrenceCount >
        Map<T, Integer> mostFrequentElements = new HashMap<>();
        for (T element : elements) {
            Integer numberOfOccurrences = mostFrequentElements.get(element);
            if (numberOfOccurrences == null) {
                mostFrequentElements.put(element, 1);
            } else {
                mostFrequentElements.put(element, numberOfOccurrences + 1);
            }
        }

        Integer highestNumberOfOccurrences = 0;
        T mostFrequentElement = null;

        for (T number : mostFrequentElements.keySet()) {
            Integer numberOfOccurrences = mostFrequentElements.get(number);
            if (numberOfOccurrences > highestNumberOfOccurrences) {
                highestNumberOfOccurrences = numberOfOccurrences;
                mostFrequentElement = number;
            }
        }
        return mostFrequentElement;
    }

    /**
     * Retrieves a list without duplicates words for the list of words given as parameter.
     * e.g => ["hello", "world", "hello", "java", "world"] will return ["hello", "world", "java"]
     *
     * @param words the list of words e.g ["hello", "world", "hello", "java", "world"]
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
     * Retrieves a list with the squared values for the list of numbers given as parameter.
     * "square of a number n is the result of the number multiplied by itself"
     * e.g => [4,9,15,2] will return [16,81,225,4]
     *
     * @param numbers the list of numbers e.g [4,9,15,2]
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