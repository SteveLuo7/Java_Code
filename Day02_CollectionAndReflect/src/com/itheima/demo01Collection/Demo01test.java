package com.itheima.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01test {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("it");
        coll.add("heima");
        System.out.println(coll);

        boolean result = coll.remove("hello");
        System.out.println(result);

        System.out.println(coll);

        coll.clear();

        System.out.println(coll);

        boolean result1 = coll.contains("java");
        System.out.println(result1);

        System.out.println(coll.isEmpty());

        System.out.println(coll.size());

        coll.add("hello");
        coll.add("luo");
        coll.add("shi");
        coll.add("bin");
        coll.add("niubi");

        Object[] arr = coll.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }




    }

}
