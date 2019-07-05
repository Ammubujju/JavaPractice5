package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingSetTest {
    SortingSet sortingset;
    String expected = "", actual = "";

    @Before
    public void setUp() {
        sortingset = new SortingSet();
    }

    @Test
    public void givenInputHashSetShouldReturnSortedOrder() {
        //arrange
        expected = "[Alice, Harry, Olive]";
        actual = sortingset.addelements("Harry Olive Alice".split(" ")).toString();
        //assert
        assertEquals(expected, actual);

    }

    @Test
    public void givenInputHashSetShouldReturnNothing() {
        //arrange
        expected = "[]";
        actual = sortingset.addelements("".split(" ")).toString();
        //assert
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() {

        sortingset = null;
    }

}
