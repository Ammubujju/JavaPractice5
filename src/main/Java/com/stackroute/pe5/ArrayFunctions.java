package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayFunctions
{

    List<String> stringList = new ArrayList<>();

    // converting array of string to List
    public  List<String> addArray(String[] inputArray) {
        for (String input : inputArray) {
            stringList.add(input);
        }
        return stringList;
    }

    //  removing all elements of list
    public List<String> remove()
    {
        stringList.clear();
        return stringList;
    }

    // replace list value with respective index
    public List<String> update(int index, String value) {
        stringList.set(index, value);
        return stringList;
    }

}
