package com.rbalazs;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Some examples of DSA(Data Structure and Algorithms) over Collections
 *
 * @author Rodrigo Balazs
 */
public class CollectionExamples {

    /**
     * Retrieves a sorted list filtered only with the words that contains the substring 'substringToFilter' given as parameter.
     * e.g => ["root", "house", "avocado", "rest", "music", "average"] and substringToFilter = "av"
     *        will return ["avocado", "average"]
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
     * Retrieves the first word of the 'list of 'words' given as parameter which starts with the prefix 'prefixToFind'.
     * e.g => ["root", "house", "avocado", "rest", "music", "average"] and prefixToFind = "re"
     *        will return "rest"
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
     * Retrieves the most frequent integer of a given 'list of integers'.
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
     * Character, Integer, Long, etc ).
     * e.g => ['a', 'c', 'c', 'd'] the most frequent element is 'c'
     */
    public static <T> T mostFrequentElementViaGenerics(final List<T> elements) {

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

    /**
     * Retrieves a list without duplicates words for the 'list of words' given as parameter.
     * e.g => ["hello", "world", "hello", "java", "world"] will return ["hello", "world", "java"]
     */
    public static List<String> removeDuplicatesUsingStreams(final List<String> words) {

        if(CollectionUtils.isEmpty(words)) {
            return Collections.emptyList();
        }

        return words.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * Retrieves a list without duplicates words for the 'list of words' given as parameter.
     * e.g => ["hello", "world", "hello", "java", "world"] will return ["hello", "world", "java"]
     * - implemented using a LinkedHashMap to maintain insertion order
     */
    public static List<String> removeDuplicatesUsingMap(final List<String> words) {

        if(CollectionUtils.isEmpty(words)) {
            return Collections.emptyList();
        }

        // < String, numberOfOccurrences >
        Map<String, Integer> mostFrequentWords = new LinkedHashMap<>();
        for (String word : words) {
            Integer numberOfOccurrences = mostFrequentWords.get(word);
            if (numberOfOccurrences == null) {
                mostFrequentWords.put(word, 1);
            } else {
                mostFrequentWords.put(word, numberOfOccurrences + 1);
            }
        }

        List<String> wordsWithoutDuplicates = new ArrayList<>();
        for (String word : mostFrequentWords.keySet()) {
            wordsWithoutDuplicates.add(word);
        }
        return wordsWithoutDuplicates;
    }

    /**
     * Retrieves a list with the squared values for the 'list of numbers' given as parameter
     * e.g => [4,9,15,2] will return [16,81,225,4]
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