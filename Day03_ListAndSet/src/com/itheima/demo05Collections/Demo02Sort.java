package com.itheima.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();
        Collections.addAll(list01,"a","b","c","d","e","abc","def");
        Collections.sort(list01);

        System.out.println(list01);

        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02,"a","c","b");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
//        list03.add(new Person("Cristiano",37));
//        list03.add(new Person("Leo",35));
//        list03.add(new Person("Bruno",28));
//        System.out.println(list03);

        Collections.addAll(list03,new Person("Cristiano",37),new Person("Leo",35),new Person("Bruno",28));
        System.out.println(list03);

        Collections.sort(list03);
        System.out.println(list03);
    }
}
