package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCountTest {
    WordCount wordcount;
    String expected = "", actual = "";

    @Before
    public void setUp() {
        wordcount = new WordCount();
    }

    @Test
    public void givenInputStringShouldReturnCountOfWord() {
        expected = "{one=5, two=2, three=2}";
        actual = wordcount.checkFrequency("one one -one_two,,three,one @three*one?two");
        assertEquals(expected, actual);
    }

    @Test
    public void givenStringReturnsNull() {
        String actual = wordcount.checkFrequency(null);
        assertNull(actual);
    }

    @After
    public void tearDown() {
        wordcount = null;
    }
}
