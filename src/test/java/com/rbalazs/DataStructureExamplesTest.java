package com.rbalazs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataStructureExamplesTest {

    @Test
    public void testReverseStringViaStack(){
        assertEquals("evif", DataStructureExamples.reverseStringViaStack("five"));
    }

    @Test
    public void testReverseStringViaStack_emptyString(){
        assertEquals("", DataStructureExamples.reverseStringViaStack(""));
    }
}

