package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {
        show01();
        show02();

    }

    private static void show01() {
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("lichen", "Fanbingbing1");
        System.out.println(v1);
        String v2 = map.put("lichen", "Fanbingbing2");
        System.out.println(v2);

        System.out.println(map);

        map.put("Lengfeng", "Longxiaoyun");
        map.put("Yangguo", "Xiaolongnv");
        map.put("Yinzhiping", "Xiaolongnv");

        System.out.println(map);
    }

    private static void show02() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Zhaoliyin", 168);
        map1.put("AngelaBaby", 165);
        map1.put("Linzhiying", 175);

        System.out.println(map1);

        Integer int1 = map1.remove("AngelaBaby");
        System.out.println(int1);
        System.out.println(map1);

        Integer v1 = map1.get("Zhaoliyin");
        System.out.println(v1);



    }
}
