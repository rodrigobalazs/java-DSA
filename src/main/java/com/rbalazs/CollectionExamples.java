package com.rbalazs;

import org.apache.commons.collections4.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Some examples of DSA(Data Structure and Algorithms) over Collections(List,Set,etc).
 *
 * @author Rodrigo Balazs
 */
public class CollectionExamples {

    /**
     * Retrieves the most frequent integer of a given list of integers.
     * e.g => [4, 9, 3, 2, 2, 2, 1, 5] the most frequent integer is 2
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
     */
    public static <T> T mostFrequentElement(final List<T> elements) {

        if (CollectionUtils.isEmpty(elements)) {
            return null;
        }

        // < Element, numberOfOccurrences >
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

        for (T element : mostFrequentElements.keySet()) {
            Integer numberOfOccurrences = mostFrequentElements.get(element);
            if (numberOfOccurrences > highestNumberOfOccurrences) {
                highestNumberOfOccurrences = numberOfOccurrences;
                mostFrequentElement = element;
            }
        }
        return mostFrequentElement;
    }
}