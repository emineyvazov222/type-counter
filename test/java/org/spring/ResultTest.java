package org.spring;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void testIsInteger() {
        assertTrue(Result.isInteger("123"), "123 tam ədəddir.");
        assertFalse(Result.isInteger("123.45"), "123.45 tam ədəd deyil.");
        assertFalse(Result.isInteger("hello"), "hello tam ədəd deyil.");
    }

    @Test
    void testIsDouble() {
        assertTrue(Result.isDouble("123.45"), "123.45 double dəyərdir.");
        assertTrue(Result.isDouble("123"), "123 həm də double dəyərdir.");
        assertFalse(Result.isDouble("hello"), "hello double dəyər deyil.");
    }

    @Test
    void testTypeCounter() {

        String sentence = "123 hello 45.67 world 89";


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));


        Result.typeCounter(sentence);

        String newLine = System.lineSeparator();

        String expectedOutput = "String count: 2" + newLine +
                "Integer count: 2" + newLine +
                "Double count: 1" + newLine;


        assertEquals(expectedOutput, outContent.toString());


        System.setOut(System.out);
    }

}