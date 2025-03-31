package com.rbalazs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursionExamplesTest {

    @Test
    public void factorial(){
        assertEquals(120, RecursionExamples.factorial(5));
    }

    @Test
    public void fibonacci(){
        assertEquals(55, RecursionExamples.fibonacci(10));
    }

}
