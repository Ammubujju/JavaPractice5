package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation
{
    public String stringChange(Map<String,String> map)
    {
        if(map==null)
        {
            return null;
        }

        Map<String, String> swapmap = new HashMap<String, String>();

        String temp=map.get("val1");
        map.put("val2",temp);              // swaping of values
        map.put("val1"," ");
        return map.toString();
    }
}
