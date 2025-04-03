package com.rbalazs;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

/**
 * Some examples of DSA(Data Structure and Algorithms) which involves operations with Arrays
 *
 * @author Rodrigo Balazs
 */
public class ArrayExamples {

    /**
     * Checks whether the array of integers given as parameter contains duplicates numbers or not
     * e.g => [4,1,1,2] will return true
     */
    public static boolean hasDuplicates(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        return set.size() < array.length;
    }

    /**
     * Retrieves an array without duplicates numbers for the 'array of numbers' given as parameter using Streams
     * as implementation.
     * e.g => [4,9,4,4,1,2,2] will return [4,9,1,2]
     */
    public static int[] removeDuplicatesNumbersUsingStreams(final int[] numbers) {

        if(ArrayUtils.isEmpty(numbers)) {
            return new int[]{};
        }
        return Arrays.stream(numbers)
                .distinct()
                .toArray();
    }

    /**
     * Retrieves an array without duplicates numbers for the 'array of numbers' given as parameter using
     * a LinkedHashMap as implementation ( maintain insertion order )
     * e.g => [4,9,4,4,1,2,2] will return [4,9,1,2]
     */
    public static int[] removeDuplicatesNumbersUsingMap(final int[] numbers) {

        if(ArrayUtils.isEmpty(numbers)) {
            return new int[]{};
        }

        // < Integer, numberOfOccurrences >
        Map<Integer, Integer> mapMostFrequentNumbers = new LinkedHashMap<>();
        for (int number : numbers) {
            Integer numberOfOccurrences = mapMostFrequentNumbers.get(number);
            if (numberOfOccurrences == null) {
                mapMostFrequentNumbers.put(number, 1);
            } else {
                mapMostFrequentNumbers.put(number, numberOfOccurrences + 1);
            }
        }

        // convert the map´s keys into an array
        int[] arrayNumbersWithoutDuplicates = new int[mapMostFrequentNumbers.size()];
        int i = 0;
        for (Integer number : mapMostFrequentNumbers.keySet()) {
            arrayNumbersWithoutDuplicates[i] = number;
            i++;
        }
        return arrayNumbersWithoutDuplicates;
    }

    /**
     * Retrieves for the 'array of numbers' given as parameter and a given 'target' number, an array with the indexes
     * of the 2 numbers which add up to target
     * implementation: brute-force solution using nested-loops | time complexity O(n*m)
     *
     * e.g: twoSum([4,1,2],6) => [0,2]
     */
    public static int[] twoSum(final int[] numbers, final int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * Retrieves for the 'array of numbers' given as parameter and a given 'target' number, the index position of 'target'
     * into the array ( if present )
     *
     * implementation: linear search ( for loop ) | time complexity O(n)
     * e.g: retrievePositionInArray([4,1,2,9,5],9) => 3
     */
    public static int retrievePositionInArray(final int[] numbers, final int target) {
        if(ArrayUtils.isEmpty(numbers)){
            return -1;
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == target){
                return i;
            }
        }
        return -1;
    }

    /**
     * Retrieves for the 'array of numbers' given as parameter and a given 'target' number, the index position of 'target'
     * into the array ( if present )
     * implementation: binary search ( 'numbers' needs to be Ordered ) | time complexity O(log n)
     *
     * e.g: retrievePositionInArrayUsingBinarySearch([1,2,4,5,9],9) => 4
     */
    public static int retrievePositionInArrayUsingBinarySearch(final int[] numbers, final int target) {
        if(ArrayUtils.isEmpty(numbers)){
            return -1;
        }
        int position = Arrays.binarySearch(numbers, target);
        if(position >= 0){
            return position;
        } else {
            return -1;
        }
    }

}