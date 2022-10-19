package com.itheima.demo03.Map;

import java.security.Key;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a",null);
        map.put("b",null);
        map.put("c","c");
        map.put("d","d");

        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + value);

        }


    }
}
