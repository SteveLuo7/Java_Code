package com.itheima.demo01.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");

        System.out.println(list);

        list.add(3,"itheima");
        System.out.println(list);

        String remove = list.remove(2);
        System.out.println(" 被移除的元素是" + remove);
        System.out.println(list);

        String set = list.set(4, "A");
        System.out.println("被替换的元素是 " + set);
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            System.out.println(s);
//
//        }
//        System.out.println("===================");
//
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }
        System.out.println("===================");
        for (String s1 :list) {
            System.out.print(s1);
        }

    }
}
