package com.itheima.demo06.Predicate;

import java.util.function.Predicate;

public class Demo01Predicate {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "abcde";

        boolean b = checkString(s, str -> str.length() > 3);


        System.out.println(b);
    }
}
