package com.itheima.demo02.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        show02();

    }
    private static void show01() {
        Map<String, Person> map = new HashMap<>();
        map.put("ManchesterUnited",new Person("Cristiano", 37));
        map.put("RealMadrid",new Person("Benzema", 35));
        map.put("PSG",new Person("Leo", 35));
        map.put("ManchesterCity",new Person("Kevin", 32));

        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + value);

        }

    }
    private static void show02() {
        Map<Person, String> map2 = new HashMap<>();
        map2.put(new Person("Cristiano", 37), "Portugal");
        map2.put(new Person("Benzema", 35),"France");
        map2.put(new Person("Leo", 35),"Argentina");
        map2.put(new Person("Kevin", 32),"Belgium");
        map2.put(new Person("Kevin", 32),"UnitedState");

        Set<Map.Entry<Person, String>> set = map2.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + value);

        }

    }
}
