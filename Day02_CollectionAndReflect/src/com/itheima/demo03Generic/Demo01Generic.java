package com.itheima.demo03Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show01();
        show02();

    }

    private static void show01() {

        ArrayList list = new ArrayList();
        list.add("abc");


        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            String s = (String) obj;
            System.out.println(s.length());
        }

    }

    private static void show02() {

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("123");
        list2.add("abc");

        Iterator<String> it2 = list2.iterator();

        while(it2.hasNext()){
            String s1 = it2.next();
            System.out.println(s1.length());
            System.out.println(s1);
        }
        for (String s : list2) {
            System.out.print(s);
        }

    }
}
