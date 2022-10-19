package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03EntrySet {
        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("Cristiano", 37);
            map.put("Leo", 35);
            map.put("Lebron", 36);
            map.put("Zelatan", 40);

            Set<Map.Entry<String, Integer>> set = map.entrySet();

            Iterator<Map.Entry<String, Integer>> it = set.iterator();
            while (it.hasNext()) {
                Map.Entry<String, Integer> entry = it.next();
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key + value);
            }

            for (Map.Entry<String, Integer> entry : set) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key + value);
            }
        }




    }
