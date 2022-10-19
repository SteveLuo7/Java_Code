package com.itheima.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);

        boolean r1 = coll.add("hello");
        boolean r2 = coll.add("world");

        System.out.println("r1" + r1);
        System.out.println("r2" + r2);

        System.out.println(coll);


    }


}
