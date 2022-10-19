package com.itheima.demo03.LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {
    public static Comparator<String> getComparator() {

//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };

        return (o1, o2)-> o2.length() - o1.length();

    }

    public static void main(String[] args) {
//        创建一个字符串数组
        String[] arr = {"a","dddd","ccc"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println("排序后的数组： " + Arrays.toString(arr));
    }
}
