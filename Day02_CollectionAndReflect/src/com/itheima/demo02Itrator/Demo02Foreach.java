package com.itheima.demo02Itrator;

import java.util.ArrayList;

public class Demo02Foreach {
    public static void main(String[] args) {
        demo01();
    }
    private static void demo01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for (String s:list) {
            System.out.println(s);
        }

        int[] arr = {1,2,3,4,5};
        for(int i :arr) {
            System.out.println(i);
        }
    }
}
