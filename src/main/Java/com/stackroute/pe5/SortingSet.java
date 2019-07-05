package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortingSet
{
    HashSet<String> sort=new HashSet<String>();
    //adding elements
    public List<String> addelements(String[] inputArray)
    {
        for(String input:inputArray)
        {
            sort.add(input);            // Adding elements to list

        }
        List<String> list=new ArrayList<String>(sort);
        Collections.sort(list);        // Elements are sorted
        return list;
    }
}