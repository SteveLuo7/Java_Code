package com.itheima.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"a","b","c");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

    }
}
