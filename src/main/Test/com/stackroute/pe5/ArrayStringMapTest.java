package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStringMapTest
{
    ArrayStringMap arraystringmap;
    String expected="",actual="";
    @Before
    public void setUp()
    {
        arraystringmap=new ArrayStringMap();
    }
    @Test
    public void givenInputShouldReturnMapWithStringAndTrue()
    {
        //arrange
        expected = "{a=true, b=false, c=true, d=false}";
        actual=arraystringmap.checkCount("a,b,c,d,a,c,c");
        //assert
        assertEquals(expected,actual);
    }
    @Test
    public void givenInputShouldReturnFalseWhenGivenEmptyString()
    {
        //arrange
        String expected = "{=false}";
        String actual=arraystringmap.checkCount("");
        //assert
        assertEquals(expected,actual);
    }
    @Test
    public void givenInputArrayListReturnNull()
    {
        //arrange
        String actual=arraystringmap.checkCount(null);
        //assert
        assertNull(actual);
    }
    @After
    public void tearDown()
    {
        arraystringmap=null;
    }
}
