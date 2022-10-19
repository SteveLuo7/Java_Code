package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Cristiano", 37);
        map.put("Leo", 35);
        map.put("Lebron", 36);
        map.put("Zelatan", 40);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + value);
        }
        System.out.println("=======================");
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + value);
        }


    }
}
