package com.junit;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyNameIsTest {

    @Test
    void testMyNameIsOutput() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);


        MyNameIs.main(new String[]{});


        String expectedOutput = "My name is\nLeyla\nMusse\n";
        String actualOutput = outputStream.toString();
        assertEquals(expectedOutput, actualOutput);


        System.setOut(originalOut);
    }
}
