package com.itheima.demo02Itrator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
//        创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        coll.add("Cristiano");
        coll.add("Jaden");
        coll.add("Sancho");
        coll.add("Paul");
        coll.add("David");

        System.out.print(coll);
//      多态 接口        实现类对象
        Iterator<String> it = coll.iterator();

        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }

        System.out.println("======================");



//        boolean b = it.hasNext();
//        System.out.println(b);
//        String s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//         s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);





    }

}
