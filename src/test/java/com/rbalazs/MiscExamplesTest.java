package com.rbalazs;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import com.rbalazs.MiscExamples;

public class MiscExamplesTest {

    @Test
    public void calculateAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = MiscExamples.calculateAverage(numbers);
        assertEquals(3.0, average);
    }
}
