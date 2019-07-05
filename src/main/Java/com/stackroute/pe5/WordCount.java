package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount
{
    public String checkFrequency(String input)
    {
        if(input==null)
        {
            return null;
        }
        List<String> string= Arrays.asList(input.split("[\\W_]+"));    // splitting the string

        Map<String, Integer> map = new HashMap<>();

        for (String s:string) {

            if (map.containsKey(s))
            {
                map.replace(s, map.get(s)+1);
            }
            else {

                map.put(s,  1);
            }
        }
        return map.toString();
    }
}
