package com.itheima.demo02.Set;

import java.util.HashSet;

public class Demo02HashSetSaveService {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("种地");
        set.add("通话");
        set.add("abc");

        System.out.println(set);

    }
}
