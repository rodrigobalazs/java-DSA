package com.rbalazs;

import org.apache.commons.collections4.CollectionUtils;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MiscExamples {

    public static double calculateAverage(final List<Integer> numbers){
        if(CollectionUtils.isEmpty(numbers)){
            return 0;
        }
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    public static void concurrency() {

        Runnable task = () -> { System.out.println("executing run()!"); };

        /* Runnable task = new Runnable() {
            public void run() {
                System.out.println("executing run()!");
            }
        }; */

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(task);
    }
}
